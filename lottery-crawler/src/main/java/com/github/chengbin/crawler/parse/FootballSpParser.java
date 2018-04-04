package com.github.chengbin.crawler.parse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.chengbin.crawler.entity.FootballSp;
import com.github.chengbin.core.util.DateUtil;
import com.github.chengbin.crawler.util.IssueUtil;
import com.github.chengbin.core.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * @author zhangcb
 * @created 2018-01-16 11:05.
 */
@Slf4j
@Component
public class FootballSpParser implements Parser<List<FootballSp>> {

    private static final String SPFURL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=had&_=1506649626205";
    private static final String RFSPFURL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=hhad&_=1506649626205";
    private static final String ZJQFURL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=ttg&_=1506651195682";
    private static final String BQCURL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=hafu&_=1506651446673";
    private static final String BFURL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=crs&_=1506651677787";

    private static final String HOST = "i.sporttery.cn";
    private static final String AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.221 Safari/537.36 SE 2.X MetaSr 1.0";

    @Autowired
    private OkHttpClient okHttpClient;

    @Override
    public List<FootballSp> parse(String url) {
        List<FootballSp> footballSpList = null;
        Response response = null;
        try{
            long t1 = System.currentTimeMillis();
            Request request = new Request.Builder().url(url).header("Host",HOST).header("User-Agent",AGENT).build();
            response = okHttpClient.newCall(request).execute();
            String result = response.body().string();
            if (StringUtils.isEmpty(result)) {
                log.info("【竞彩足球赔率抓取】抓取赔率为空!");
                return footballSpList;
            }
            //处理为空的情况，data:[]
            JSONObject json = JSONObject.parseObject(result);
            if(json.get("data") instanceof JSONArray){
                return footballSpList;
            }
            footballSpList = new ArrayList<>();
            JSONObject jsonData = json.getJSONObject("data");
            for (Map.Entry<String, Object> entry : jsonData.entrySet()) {
                String key = entry.getKey();
                JSONObject spData = (JSONObject)entry.getValue();

                FootballSp sp = new FootballSp();
                String weekStr = spData.getString("num");
                String teamId = "";
                if(weekStr.length() == 5){
                    teamId = weekStr.substring(2,5);
                }
                Date matchTime = DateUtil.stringToDate(spData.getString("date") + " " + spData.getString("time"), "yy-MM-dd HH:mm");
                String issue = IssueUtil.getIssueDay(weekStr.substring(0,2),matchTime);
                String matchId = issue + teamId;
                sp.setIssue(issue);
                sp.setMatchId(matchId);
                sp.setNumber(weekStr);
                //胜平负
                JSONObject spf = (JSONObject)spData.get("had");
                if(null != spf){
                    sp.setSheng(spf.getDouble("h"));
                    sp.setPing(spf.getDouble("d"));
                    sp.setFu(spf.getDouble("a"));
                }
                //让球胜平负
                JSONObject rfspf = (JSONObject)spData.get("hhad");
                if(null != rfspf){
                    sp.setRqSheng(rfspf.getDouble("h"));
                    sp.setRqPing(rfspf.getDouble("d"));
                    sp.setRqFu(rfspf.getDouble("a"));
                    sp.setRate(rfspf.getInteger("fixedodds"));
                }
                //总进球
                JSONObject zjq = (JSONObject)spData.get("ttg");
                if(null != zjq){
                    sp.setT0(zjq.getDouble("s0"));
                    sp.setT1(zjq.getDouble("s1"));
                    sp.setT2(zjq.getDouble("s2"));
                    sp.setT3(zjq.getDouble("s3"));
                    sp.setT4(zjq.getDouble("s4"));
                    sp.setT5(zjq.getDouble("s5"));
                    sp.setT6(zjq.getDouble("s6"));
                    sp.setT7(zjq.getDouble("s7"));
                }
                //半全场
                JSONObject bqc = (JSONObject)spData.get("hafu");
                if(null != bqc){
                    sp.setSs(bqc.getDouble("hh"));
                    sp.setSp(bqc.getDouble("hd"));
                    sp.setSf(bqc.getDouble("ha"));
                    sp.setPs(bqc.getDouble("dh"));
                    sp.setPp(bqc.getDouble("dd"));
                    sp.setPf(bqc.getDouble("da"));
                    sp.setFs(bqc.getDouble("ah"));
                    sp.setFp(bqc.getDouble("ad"));
                    sp.setFf(bqc.getDouble("aa"));
                }
                //比分
                JSONObject bf = (JSONObject)spData.get("crs");
                if(null != bf){
                    sp.setS10(bf.getDouble("0100"));
                    sp.setS20(bf.getDouble("0200"));
                    sp.setS21(bf.getDouble("0201"));
                    sp.setS30(bf.getDouble("0300"));
                    sp.setS31(bf.getDouble("0301"));
                    sp.setS32(bf.getDouble("0302"));
                    sp.setS40(bf.getDouble("0400"));
                    sp.setS41(bf.getDouble("0401"));
                    sp.setS42(bf.getDouble("0402"));
                    sp.setS50(bf.getDouble("0500"));
                    sp.setS51(bf.getDouble("0501"));
                    sp.setS52(bf.getDouble("0502"));
                    sp.setSother(bf.getDouble("-1-h"));

                    sp.setP00(bf.getDouble("0000"));
                    sp.setP11(bf.getDouble("0101"));
                    sp.setP22(bf.getDouble("0202"));
                    sp.setP33(bf.getDouble("0303"));
                    sp.setPother(bf.getDouble("-1-d"));

                    sp.setF01(bf.getDouble("0001"));
                    sp.setF02(bf.getDouble("0002"));
                    sp.setF12(bf.getDouble("0102"));
                    sp.setF03(bf.getDouble("0003"));
                    sp.setF13(bf.getDouble("0103"));
                    sp.setF23(bf.getDouble("0203"));
                    sp.setF04(bf.getDouble("0004"));
                    sp.setF14(bf.getDouble("0104"));
                    sp.setF24(bf.getDouble("0204"));
                    sp.setF05(bf.getDouble("0005"));
                    sp.setF15(bf.getDouble("0105"));
                    sp.setF25(bf.getDouble("0205"));
                    sp.setFother(bf.getDouble("-1-a"));

                    footballSpList.add(sp);
                }
            }
            log.info("【竞彩足球赔率】抓取解析共耗时：{}",(System.currentTimeMillis() - t1));
        }catch (Exception e){
            log.error("【竞彩足球赔率抓取】 抓取赔率异常:"+e);
        }finally {
            if(response.body()!=null){
                try {
                    response.body().close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return footballSpList;
    }
}

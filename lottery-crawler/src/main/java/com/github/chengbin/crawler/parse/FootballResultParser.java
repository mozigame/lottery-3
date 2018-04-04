package com.github.chengbin.crawler.parse;

import com.github.chengbin.crawler.entity.FootballMatch;
import com.github.chengbin.core.util.DateUtil;
import com.github.chengbin.crawler.util.IssueUtil;
import com.github.chengbin.crawler.util.JsoupUtil;
import com.github.chengbin.core.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.NumberUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author zhangcb
 * @created 2018-01-16 11:05.
 */
@Slf4j
@Component
public class FootballResultParser implements Parser<List<FootballMatch>> {

    private static String lastUpdateTime = "";    //上次更新时间

    @Override
    public List<FootballMatch> parse(String url) {
        List<FootballMatch> resultList = null;
        try{
            long t1 = System.currentTimeMillis();
            Document document = JsoupUtil.getDocument(url);
            if (StringUtils.isEmpty(document)) {
                log.info("【竞彩足球赛果抓取】抓取赛果为空!");
                return resultList;
            }

            String timeStr = document.select("form div[class='FloatR']").text();
            if(lastUpdateTime.equals(timeStr)) {
                log.info("【竞彩足球赛果抓取】赛果暂无更新!");
                return resultList;
            }
            resultList = parseResult(document);
            Elements elements =  document.select("table.m-page").select("li"); //查询总页数
            if(null !=elements && elements.size()>0){
                HashSet<String> pages = new HashSet<String>();
                for(Element element : elements){
                    if(NumberUtils.isNumber(element.text())){
                        int _page = NumberUtils.toInt(element.text());
                        if(_page>1){
                            pages.add(element.getElementsByTag("a").attr("href"));
                        }
                    }
                }
                if(pages.size()>0) { //分页查询
                    Iterator<String> iterator = pages.iterator();
                    if(null == resultList){
                        resultList = new ArrayList<>();
                    }
                    while (iterator.hasNext()) {
                        String _queryUrl = iterator.next();
                        if (StringUtils.isEmpty(_queryUrl)) {
                            continue;
                        }
                        document = JsoupUtil.getDocument("http://info.sporttery.cn/football/" + _queryUrl);
                        if (StringUtils.isEmpty(document)) {
                            continue;
                        }
                        List<FootballMatch> _resultList = parseResult(document);
                        if (StringUtils.isNotEmpty(_resultList)) {
                            resultList.addAll(_resultList);
                        }
                    }
                }
            }
            lastUpdateTime = timeStr;
            log.info("【竞彩足球赛果】抓取解析共耗时：{}",(System.currentTimeMillis() - t1));
        }catch (Exception e){
            log.error("【竞彩足球赛果抓取】 抓取赛果异常:"+e);
        }
        return resultList;
    }

    /**
     * 解析赛果
     * @return
     */
    private List<FootballMatch> parseResult(Document document) {
        List<FootballMatch> resultList = new ArrayList<>();
        try {
            Elements matchnodes = document.getElementsByClass("match_list");
            if (matchnodes == null || matchnodes.size() < 2) {
                log.info("【竞彩足球赛果抓取】暂无赛果!");
                return resultList;
            }
            Elements trs = matchnodes.get(1).getElementsByTag("tr");
            if(null == trs || trs.size() < 2)
            {
                log.info("【竞彩足球赛果抓取】暂无赛果!");
                return resultList;
            }
            for(int i = 0; i < trs.size(); i++)
            {
                Elements tds = trs.get(i).getElementsByTag("td");
                if(tds != null && tds.size() >= 11)
                {
                    String lastscore = tds.get(5).getElementsByTag("span").text();
                    String status = tds.get(9).text();
                    if (StringUtils.isNotEmpty(lastscore) && "已完成".equals(status)) {
                        //有比分和开奖结果有赛果
                        FootballMatch footballMatch = new FootballMatch();
                        footballMatch.setLastScore(lastscore);
                        footballMatch.setLastScore(lastscore);

                        String time = tds.get(0).text();
                        Date matchTime = DateUtil.stringToDate(time, "yyyy-MM-dd");
                        String weekStr = tds.get(1).text();
                        String issueCode = IssueUtil.getIssueDay(weekStr.substring(0,2),matchTime);
                        footballMatch.setNumber(weekStr.substring(2,5));
                        footballMatch.setMatchId(issueCode + footballMatch.getNumber());
                        String onescore = tds.get(4).getElementsByTag("span").text();
                        footballMatch.setHalfScore(onescore);
                        resultList.add(footballMatch);
                    }
                }
            }
        } catch (Exception e) {
            log.error("【竞彩足球赛果抓取】解析异常!",e);
        }
        return resultList;
    }
}

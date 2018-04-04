package com.github.chengbin.crawler.parse;

import com.github.chengbin.core.util.DateUtil;
import com.github.chengbin.core.util.StringUtils;
import com.github.chengbin.crawler.constant.FootballContants;
import com.github.chengbin.crawler.entity.FootballMatch;
import com.github.chengbin.crawler.util.FootballUtil;
import com.github.chengbin.crawler.util.IssueUtil;
import com.github.chengbin.crawler.util.JsoupUtil;
import lombok.extern.slf4j.Slf4j;
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
public class FootballMatchParser implements Parser<Map<String,List<FootballMatch>>> {

    private static String lastUpdateTime = "";    //上次更新时间

    @Override
    public Map<String,List<FootballMatch>> parse(String url) {
        Map<String,List<FootballMatch>> matchMap = null;
        try{
            long t1 = System.currentTimeMillis();
            Document document = JsoupUtil.getDocument(url);
            if (StringUtils.isEmpty(document)) {
                log.info("【竞彩足球对阵抓取】抓取对阵为空!");
                return matchMap;
            }

            String timeStr = document.select("div[class='u-time']").text();
            if(lastUpdateTime.equals(timeStr)) {
                log.info("【竞彩足球对阵抓取】对阵暂无更新!");
                return matchMap;
            }
            Elements matchnodes = document.getElementsByClass("match_list");
            if (matchnodes == null || matchnodes.size() < 2) {
                log.info("【竞彩足球对阵抓取】暂无比赛!");
                return matchMap;
            }
            Elements nodes = matchnodes.get(1).children();
            if(null == nodes || nodes.size() == 0)
            {
                log.info("【竞彩足球对阵抓取】暂无比赛!");
                return matchMap;
            }
            matchMap = new HashMap<>();
            boolean  newIssue = false;
            String issue = "";      //期次
            List<FootballMatch> matchList = null;
            for(int i = 0; i < nodes.size(); i++)
            {
                if(i % 2 == 0)
                {
                    newIssue = true;
                    //出现新期次，保存上一期的对阵
                    if(newIssue && !StringUtils.isEmpty(matchList)){
                        matchMap.put(issue,matchList);
                    }
                    //初始化新期次集合
                    matchList = new ArrayList<>();
                }
                else
                {
                    Elements trs = nodes.get(i).getElementsByTag("tr");
                    if(!StringUtils.isEmpty(trs))
                    {
                        for(int j = 0; j < trs.size(); j++)
                        {
                            Elements tds = trs.get(j).getElementsByTag("td");
                            if(tds != null && tds.size() > 0)
                            {
                                //这里能抓取到的比赛都是正常销售的比赛
                                String status = tds.get(5).text();
                                if(!"已开售".equals(status))
                                {
                                    continue;
                                }
                                FootballMatch footBallMatch = new FootballMatch();
                                String weekStr = tds.get(0).text();
                                if(weekStr.length() == 5){
                                    footBallMatch.setWeekday(DateUtil.getWeekDay(weekStr.substring(0,2)));
                                    footBallMatch.setNumber(weekStr.substring(2,5));
                                }
                                String league = tds.get(1).text();
                                footBallMatch.setLeague(league);
                                String color = tds.get(1).attr("bgcolor");
                                footBallMatch.setColor(color);

                                Element team = tds.get(2);
                                String homeTeam = team.getElementsByClass("zhu").text();
                                String guestTeam = team.getElementsByClass("ke").text();
                                footBallMatch.setHomeTeamName(homeTeam);
                                footBallMatch.setGuestTeamName(guestTeam);

                                String href = team.getElementsByTag("a").attr("href");
                                String jcwid = href.split("=")[1];
                                footBallMatch.setJcwId(Integer.parseInt(jcwid));

                                String time = tds.get(3).text();
                                Date matchTime = DateUtil.stringToDate(time, "yyyy-MM-dd HH:mm");
                                footBallMatch.setMatchTime(matchTime);
                                //新的期次，根据周一001和开赛时间计算一下期次名称
                                if(newIssue){
                                    issue = IssueUtil.getIssueDay(weekStr.substring(0,2),matchTime);
                                    newIssue = false;
                                }
                                //获取销售截止时间
                                footBallMatch.setEndTime(FootballUtil.getMatchEndTime(footBallMatch.getWeekday(), matchTime));
                                footBallMatch.setMatchId(issue + footBallMatch.getNumber());
                                footBallMatch.setIssue(issue);
                                //这里能抓取到的比赛都是正常销售的比赛
                                String spfStatus = tds.get(6).getElementsByTag("div").attr("class");
                                String rqspfStatus = tds.get(7).getElementsByTag("div").attr("class");
                                String bfStatus = tds.get(8).getElementsByTag("div").attr("class");
                                String zjqStatus = tds.get(9).getElementsByTag("div").attr("class");
                                String bqcStatus = tds.get(10).getElementsByTag("div").attr("class");
                                setMatchStatus(footBallMatch, spfStatus, rqspfStatus, bfStatus, zjqStatus, bqcStatus);
                                footBallMatch.setStatus(FootballContants.MATCH_STATUS_SALE);
                                matchList.add(footBallMatch);
                            }
                        }
                    }
                }
                if(i == nodes.size() - 1 && !StringUtils.isEmpty(issue) && (null != matchList && matchList.size() > 0))
                {
                    matchMap.put(issue,matchList);
                }
            }
            lastUpdateTime = timeStr;
            log.info("【竞彩足球对阵】抓取解析共耗时：{}",(System.currentTimeMillis() - t1));
        }catch (Exception e){
            log.error("【竞彩足球对阵抓取】 抓取对阵异常:"+e);
        }
        return matchMap;
    }

    private static void setMatchStatus(FootballMatch footballMatch, String spfStatus, String rqspfStatus, String bfStatus, String zjqStatus, String bqcStatus){
        //胜平负
        if(spfStatus.contains("u-cir")) {
            footballMatch.setSpfSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setSpfPassStatus(FootballContants.BET_STATUS_SALE);
        }else if (spfStatus.contains("u-dan") ) {
            footballMatch.setSpfSingleStatus(FootballContants.BET_STATUS_SALE);
            footballMatch.setSpfPassStatus(FootballContants.BET_STATUS_SALE);
        }else if ( spfStatus.contains("u-kong") ){
            footballMatch.setSpfSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setSpfPassStatus(FootballContants.BET_STATUS_NOT_SALE);
        }
        //让球胜平负
        if(rqspfStatus.contains("u-cir")) {
            footballMatch.setRqspfSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setRqspfPassStatus(FootballContants.BET_STATUS_SALE);
        }else if (rqspfStatus.contains("u-dan") ) {
            footballMatch.setRqspfSingleStatus(FootballContants.BET_STATUS_SALE);
            footballMatch.setRqspfPassStatus(FootballContants.BET_STATUS_SALE);
        }else if ( rqspfStatus.contains("u-kong") ){
            footballMatch.setRqspfSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setRqspfPassStatus(FootballContants.BET_STATUS_NOT_SALE);
        }
        //总进球
        if(zjqStatus.contains("u-cir")) {
            footballMatch.setZjqSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setZjqPassStatus(FootballContants.BET_STATUS_SALE);
        }else if (zjqStatus.contains("u-dan") ) {
            footballMatch.setZjqSingleStatus(FootballContants.BET_STATUS_SALE);
            footballMatch.setZjqPassStatus(FootballContants.BET_STATUS_SALE);
        }else if ( zjqStatus.contains("u-kong") ){
            footballMatch.setZjqSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setZjqPassStatus(FootballContants.BET_STATUS_NOT_SALE);
        }
        //比分
        if(bfStatus.contains("u-cir")) {
            footballMatch.setBfSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setBfPassStatus(FootballContants.BET_STATUS_SALE);
        }else if (bfStatus.contains("u-dan") ) {
            footballMatch.setBfSingleStatus(FootballContants.BET_STATUS_SALE);
            footballMatch.setBfPassStatus(FootballContants.BET_STATUS_SALE);
        }else if ( bfStatus.contains("u-kong") ){
            footballMatch.setBfSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setBfPassStatus(FootballContants.BET_STATUS_NOT_SALE);
        }
        //半全场
        if(bqcStatus.contains("u-cir")) {
            footballMatch.setBqcSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setBqcPassStatus(FootballContants.BET_STATUS_SALE);
        }else if (bqcStatus.contains("u-dan") ) {
            footballMatch.setBqcSingleStatus(FootballContants.BET_STATUS_SALE);
            footballMatch.setBqcPassStatus(FootballContants.BET_STATUS_SALE);
        }else if ( bqcStatus.contains("u-kong") ){
            footballMatch.setBqcSingleStatus(FootballContants.BET_STATUS_NOT_SALE);
            footballMatch.setBqcPassStatus(FootballContants.BET_STATUS_NOT_SALE);
        }
    }
}

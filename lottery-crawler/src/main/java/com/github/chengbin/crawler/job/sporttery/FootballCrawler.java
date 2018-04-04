package com.github.chengbin.crawler.job.sporttery;

import com.github.chengbin.crawler.constant.IssueConstants;
import com.github.chengbin.crawler.constant.LotteryConstants;
import com.github.chengbin.crawler.entity.FootballMatch;
import com.github.chengbin.crawler.entity.FootballSp;
import com.github.chengbin.crawler.entity.Issue;
import com.github.chengbin.crawler.parse.FootballMatchParser;
import com.github.chengbin.crawler.parse.FootballResultParser;
import com.github.chengbin.crawler.parse.FootballSpParser;
import com.github.chengbin.crawler.service.FootballMatchService;
import com.github.chengbin.crawler.service.FootballSpService;
import com.github.chengbin.crawler.service.IssueService;
import com.github.chengbin.core.util.BeanUtils;
import com.github.chengbin.core.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 竞彩足球
 * @author zhangcb
 * @created 2018-01-16 10:58.
 */
@Component
@Slf4j
public class FootballCrawler implements Grab {

    private static final String MATCH_URL = "http://info.sporttery.cn/football/match_list.php";
    private static final String SP_URL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=hhad&poolcode[]=had&poolcode[]=ttg&poolcode[]=hafu&poolcode[]=crs&_=1506649626205";
    private static final String RESULT_URL = "http://info.sporttery.cn/football/match_result.php";

    @Autowired
    private IssueService issueService;
    @Autowired
    private FootballMatchService footballMatchService;
    @Autowired
    private FootballSpService footballSpService;

    @Autowired
    private FootballMatchParser footballMatchParser;
    @Autowired
    private FootballSpParser footballSpParser;
    @Autowired
    private FootballResultParser footballResultParser;

    /**
     * 抓取对阵
     */
    @Scheduled(fixedRate = 5*1000)
    public void grabMatch() {
        Map<String,List<FootballMatch>> matchMatch = footballMatchParser.parse(MATCH_URL);
        if(null != matchMatch){
            for (Map.Entry<String, List<FootballMatch>> entry : matchMatch.entrySet()) {
                String issues = entry.getKey();
                Date endTime = null;
                List<FootballMatch> matchList = entry.getValue();
                for (FootballMatch footballMatch : matchList) {
                    try {
                        //更新比赛
                        FootballMatch match = footballMatchService.selectByPrimaryKey(footballMatch.getMatchId());
                        if(null == match){
                            footballMatch.setCreateTime(new Date());
                            footballMatch.setUpdateTime(new Date());
                            footballMatchService.insert(footballMatch);
                        }else{
                            BeanUtils.copyProperties(match,footballMatch,true);
                            match.setUpdateTime(new Date());
                            footballMatchService.updateByPrimaryKeySelective(match);
                        }
                        if(null == endTime || endTime.getTime() < footballMatch.getMatchTime().getTime()){
                            endTime = footballMatch.getEndTime();
                        }
                    }catch (Exception e){
                        log.error("【竞彩足球对阵】更新异常,matchId:{}",footballMatch.getMatchId());
                    }
                }
                issueService.saveOrUpdateIssue(new Issue(LotteryConstants.FOOTBALL,issues, IssueConstants.STATUS_SALE,endTime));
            }
        }
    }

    /**
     * 抓取赔率
     */
    @Scheduled(fixedRate = 60*1000)
    public void grabSp() {
        List<FootballSp> footballSpList = footballSpParser.parse(SP_URL);
        if(StringUtils.isNotEmpty(footballSpList)){
            for (FootballSp sp : footballSpList) {
                try {
                    FootballSp spVO = footballSpService.findByMatchId(sp.getMatchId());
                    if(null == spVO){
                        sp.setCreateTime(new Date());
                        sp.setUpdateTime(new Date());
                        footballSpService.insert(sp);
                    }else{
                        BeanUtils.copyProperties(spVO,sp,true);
                        spVO.setUpdateTime(new Date());
                        footballSpService.updateByPrimaryKeySelective(spVO);
                    }
                }catch (Exception e){
                    log.error("【竞彩足球赔率】更新异常,matchId:{}",sp.getMatchId());
                }
            }
        }
    }

    /**
     * 抓取赛果
     */
    @Scheduled(fixedRate = 5*60*1000)
    public void grabResult() {
        List<FootballMatch> resultList = footballResultParser.parse(RESULT_URL);
        if(StringUtils.isNotEmpty(resultList)){
            for (FootballMatch result : resultList) {
                try {
                    FootballMatch footballMatch = footballMatchService.selectByPrimaryKey(result.getMatchId());
                    if(null == footballMatch || footballMatch.getState() >= 3){
                        continue;
                    }
                    footballMatch.setHalfScore(result.getHalfScore());
                    footballMatch.setLastScore(result.getLastScore());
                    footballMatch.setState(3);
                    footballMatch.setUpdateTime(new Date());
                    footballMatchService.updateByPrimaryKeySelective(footballMatch);
                }catch (Exception e){
                    log.error("【竞彩足球赛果】更新异常,matchId:{}",result.getMatchId());
                }
            }
        }
    }
}

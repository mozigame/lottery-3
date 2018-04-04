package com.github.chengbin.crawler.controller;

import com.github.chengbin.core.constant.PlayTypeConstants;
import com.github.chengbin.core.util.BetTypeUtils;
import com.github.chengbin.core.util.StringUtils;
import com.github.chengbin.core.vo.FootballMatchVO;
import com.github.chengbin.crawler.entity.FootballMatch;
import com.github.chengbin.crawler.service.FootballMatchService;
import com.github.chengbin.crawler.util.FootballUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangcb
 * @created 2018-01-19 13:33.
 */
@RestController
@RequestMapping("/football")
@Slf4j
public class FootballController {

    @Autowired
    private FootballMatchService footballMatchService;

    @RequestMapping(value = "/checkMatchIsOver",method = RequestMethod.GET)
    public Boolean checkMatchIsOver(@RequestParam("betType") Integer betType,
                                    @RequestParam("pass") String pass,
                                    @RequestParam("schemeNumber") String schemeNumber){
        String[] stems = schemeNumber.replace("content=", "").trim().split("\\$");
        String[] passes = org.apache.commons.lang.StringUtils.split(pass, ",");
        List<Integer> passType = Lists.newArrayList();  //过关方式
        if (pass.indexOf(PlayTypeConstants.MATCH_SINGLE) != -1) {
            if (null != passes && passes.length <= 1) {
                passType.add(PlayTypeConstants.MATCH_SINGLE);   //单关
            } else {
                //单关、串关
                passType.add(PlayTypeConstants.MATCH_SINGLE);   //单关
                passType.add(PlayTypeConstants.MATCH_PASS);   //串关
            }
        } else {
            passType.add(PlayTypeConstants.MATCH_PASS);   //串关
        }
        for (int i = 0; i < stems.length; i++) {
            String[] stemEx = stems[i].split("`");
            String matchId = stemEx[0];
            FootballMatch football = footballMatchService.selectByPrimaryKey(matchId);
            if (football == null) {
                log.error("比赛:{}不存在!",matchId);
                return true;
            }
            if(FootballUtil.isFootballMatchEnd(football)){
                log.error("比赛:{}已经截止!",matchId);
                return true;
            }
            String[] betTypes = stemEx[6].split(",");
            for (int j = 0; j < betTypes.length; j++) {
                //判断玩法是否开售
                for (Integer type : passType) {
                    if (FootballUtil.isFootballBetSale(BetTypeUtils.betTypeAdapter(Integer.parseInt(betTypes[j]), betType), type, football)) {
                        log.error("比赛:{}购买的玩法未开售!",matchId);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

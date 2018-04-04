package com.github.chengbin.crawler.controller;

import com.github.chengbin.core.util.BeanUtils;
import com.github.chengbin.core.vo.LotteryVO;
import com.github.chengbin.crawler.entity.Lottery;
import com.github.chengbin.crawler.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@RestController
@RequestMapping("/lottery")
public class LotteryController {

    @Autowired
    private LotteryService lotteryService;

    @RequestMapping("{lotteryId}")
    public LotteryVO selectLotteryInfo(@PathVariable("lotteryId") Integer lotteryId) throws Exception{
        LotteryVO lotteryVO = new LotteryVO();
        Lottery lottery = lotteryService.selectByPrimaryKey(lotteryId);
        BeanUtils.copyProperties(lotteryVO,lottery,false);
        return lotteryVO;
    }
}

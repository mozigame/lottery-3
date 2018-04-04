package com.github.chengbin.crawler.service.impl;

import com.github.chengbin.crawler.entity.Lottery;
import com.github.chengbin.crawler.mapper.LotteryMapper;
import com.github.chengbin.crawler.service.LotteryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@Service
@Slf4j
public class LotteryServiceImpl implements LotteryService {

    @Autowired
    private LotteryMapper lotteryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lotteryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Lottery lottery) {
        return lotteryMapper.insert(lottery);
    }

    @Override
    public Lottery selectByPrimaryKey(Integer id) {
        return lotteryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Lottery lottery) {
        return lotteryMapper.updateByPrimaryKeySelective(lottery);
    }
}

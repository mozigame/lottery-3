package com.github.chengbin.crawler.service;

import com.github.chengbin.crawler.entity.Lottery;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
public interface LotteryService {

    int deleteByPrimaryKey(Integer id);

    int insert(Lottery record);

    Lottery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lottery record);
}

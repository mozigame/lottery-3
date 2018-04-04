package com.github.chengbin.crawler.mapper;

import com.github.chengbin.crawler.entity.Lottery;

public interface LotteryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lottery record);

    int insertSelective(Lottery record);

    Lottery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lottery record);

    int updateByPrimaryKeyWithBLOBs(Lottery record);

    int updateByPrimaryKey(Lottery record);
}
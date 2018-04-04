package com.github.chengbin.crawler.service;

import com.github.chengbin.crawler.entity.FootballSp;

/**
 * @author zhangcb
 * @created on 2018/1/17.
 */
public interface FootballSpService {

    int deleteByPrimaryKey(Long id);

    int insert(FootballSp record);

    FootballSp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FootballSp record);

    FootballSp findByMatchId(String matchId);
}

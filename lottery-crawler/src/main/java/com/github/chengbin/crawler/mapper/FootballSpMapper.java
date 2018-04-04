package com.github.chengbin.crawler.mapper;

import com.github.chengbin.crawler.entity.FootballSp;
import org.apache.ibatis.annotations.Param;

public interface FootballSpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FootballSp record);

    int insertSelective(FootballSp record);

    FootballSp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FootballSp record);

    int updateByPrimaryKey(FootballSp record);

    FootballSp findByMatchId(@Param("matchId") String matchId);
}
package com.github.chengbin.crawler.mapper;

import com.github.chengbin.core.vo.FootballMatchVO;
import com.github.chengbin.crawler.entity.FootballMatch;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FootballMatchMapper {
    int deleteByPrimaryKey(String matchId);

    int insert(FootballMatch record);

    int insertSelective(FootballMatch record);

    FootballMatch selectByPrimaryKey(String matchId);

    int updateByPrimaryKeySelective(FootballMatch record);

    int updateByPrimaryKey(FootballMatch record);

    List<FootballMatchVO> selectMatchInfo(@Param("ids") List<String> ids);
}
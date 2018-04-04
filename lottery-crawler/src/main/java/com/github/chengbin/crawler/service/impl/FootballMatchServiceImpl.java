package com.github.chengbin.crawler.service.impl;

import com.github.chengbin.core.vo.FootballMatchVO;
import com.github.chengbin.crawler.entity.FootballMatch;
import com.github.chengbin.crawler.mapper.FootballMatchMapper;
import com.github.chengbin.crawler.service.FootballMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
@Service
public class FootballMatchServiceImpl implements FootballMatchService {

    @Autowired
    private FootballMatchMapper footballMatchMapper;

    @Override
    public int deleteByPrimaryKey(String matchId) {
        return footballMatchMapper.deleteByPrimaryKey(matchId);
    }

    @Override
    public int insert(FootballMatch footballMatch) {
        return footballMatchMapper.insertSelective(footballMatch);
    }

    @Override
    public FootballMatch selectByPrimaryKey(String matchId) {
        return footballMatchMapper.selectByPrimaryKey(matchId);
    }

    @Override
    public int updateByPrimaryKeySelective(FootballMatch footballMatch) {
        return footballMatchMapper.updateByPrimaryKeySelective(footballMatch);
    }

    public List<FootballMatchVO> selectMatchInfo(List<String> ids){
        return footballMatchMapper.selectMatchInfo(ids);
    }
}

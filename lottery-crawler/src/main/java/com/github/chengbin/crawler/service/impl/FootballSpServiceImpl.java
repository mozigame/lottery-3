package com.github.chengbin.crawler.service.impl;

import com.github.chengbin.crawler.entity.FootballSp;
import com.github.chengbin.crawler.mapper.FootballSpMapper;
import com.github.chengbin.crawler.service.FootballSpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangcb
 * @created 2018-01-17 16:23.
 */
@Service
public class FootballSpServiceImpl implements FootballSpService {

    @Autowired
    private FootballSpMapper footballSpMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return footballSpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FootballSp footballSp) {
        return footballSpMapper.insertSelective(footballSp);
    }

    @Override
    public FootballSp selectByPrimaryKey(Long id) {
        return footballSpMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FootballSp footballSp) {
        return footballSpMapper.updateByPrimaryKeySelective(footballSp);
    }

    public FootballSp findByMatchId(String matchId){
        return footballSpMapper.findByMatchId(matchId);
    }
}

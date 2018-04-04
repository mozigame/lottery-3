package com.github.chengbin.crawler.service.impl;

import com.github.chengbin.core.util.BeanUtils;
import com.github.chengbin.crawler.entity.Issue;
import com.github.chengbin.crawler.mapper.IssueMapper;
import com.github.chengbin.crawler.service.IssueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
@Service
@Slf4j
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueMapper issueMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return issueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Issue issue) {
        return issueMapper.insertSelective(issue);
    }

    @Override
    public Issue selectByPrimaryKey(Integer id) {
        return issueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Issue issue) {
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    public Issue findByLotteryAndIssue(Integer lotteryId, String issue) {
        return issueMapper.findByLotteryAndIssue(lotteryId,issue);
    }

    @Override
    public void saveOrUpdateIssue(Issue issue) {
        try{
            Issue issueVO = issueMapper.findByLotteryAndIssue(issue.getLotteryId(),issue.getIssue());
            if(null == issueVO){
                issue.setSellStartTime(new Date());
                issueMapper.insertSelective(issue);
            }else{
                BeanUtils.copyProperties(issueVO,issue,false);
                issueMapper.updateByPrimaryKeySelective(issueVO);
            }
        }catch (Exception e){
            log.error("【创建奖期】彩种:{}创建奖期:{}异常",issue.getLotteryId(),issue.getIssue());
        }
    }


}

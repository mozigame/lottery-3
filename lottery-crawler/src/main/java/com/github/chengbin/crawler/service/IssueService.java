package com.github.chengbin.crawler.service;

import com.github.chengbin.crawler.entity.Issue;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
public interface IssueService {

    int deleteByPrimaryKey(Integer id);

    int insert(Issue record);

    Issue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Issue record);

    Issue findByLotteryAndIssue(Integer lotteryId, String issue);

    void saveOrUpdateIssue(Issue issue);
}

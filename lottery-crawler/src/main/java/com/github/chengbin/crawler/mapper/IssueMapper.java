package com.github.chengbin.crawler.mapper;

import com.github.chengbin.crawler.entity.Issue;
import org.apache.ibatis.annotations.Param;

public interface IssueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Issue record);

    int insertSelective(Issue record);

    Issue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Issue record);

    int updateByPrimaryKey(Issue record);

    Issue findByLotteryAndIssue(@Param("lotteryId") Integer lotteryId, @Param("issue") String issue);
}
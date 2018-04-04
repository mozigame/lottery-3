package com.github.chengbin.crawler.controller;

import com.github.chengbin.core.util.BeanUtils;
import com.github.chengbin.core.vo.IssueVO;
import com.github.chengbin.crawler.entity.Issue;
import com.github.chengbin.crawler.service.IssueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhangcb
 * @created 2018-01-19 13:57.
 */
@RestController
@RequestMapping("/issue")
@Slf4j
public class IssueController {

    @Autowired
    private IssueService issueService;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    private IssueVO selectIssueInfo(@RequestParam("lotteryId") Integer lotteryId, @RequestParam("issue") String issue) throws Exception{
        IssueVO issueVO = new IssueVO();
        Issue _issue = issueService.findByLotteryAndIssue(lotteryId,issue);
        BeanUtils.copyProperties(issueVO,_issue,false);
        return issueVO;
    }
}

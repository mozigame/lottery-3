package com.github.chengbin.order.feign;

import com.github.chengbin.core.vo.IssueVO;
import com.github.chengbin.order.fallback.IssueFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@FeignClient(value = "lottery-crawler",fallback = IssueFeignFallback.class)
public interface IssueFeign {

    @RequestMapping(value = "/issue/info",method = RequestMethod.GET)
    IssueVO selectIssueInfo(@RequestParam("lotteryId") Integer lotteryId, @RequestParam("issue") String issue);
}

package com.github.chengbin.order.fallback;

import com.github.chengbin.core.vo.IssueVO;
import com.github.chengbin.order.feign.IssueFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@Component
public class IssueFeignFallback implements IssueFeign {

    @RequestMapping(value = "/issue/info",method = RequestMethod.GET)
    public IssueVO selectIssueInfo(@RequestParam("lotteryId") Integer lotteryId, @RequestParam("issue") String issue){
        return null;
    }
}

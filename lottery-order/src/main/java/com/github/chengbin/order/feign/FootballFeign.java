package com.github.chengbin.order.feign;

import com.github.chengbin.order.fallback.FootballFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author zhangcb
 * @created on 2018/1/19.
 */
@FeignClient(value = "lottery-crawler",fallback = FootballFeignFallback.class)
public interface FootballFeign {

    @RequestMapping(value = "/football/checkMatchIsOver",method = RequestMethod.GET)
    Boolean checkMatchIsOver(@RequestParam("betType") Integer betType,
                             @RequestParam("pass") String pass,
                             @RequestParam("schemeNumber") String schemeNumber);
}

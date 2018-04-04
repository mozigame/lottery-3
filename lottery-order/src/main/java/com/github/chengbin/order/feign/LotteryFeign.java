package com.github.chengbin.order.feign;

import com.github.chengbin.core.vo.LotteryVO;
import com.github.chengbin.order.fallback.LotteryFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@FeignClient(value = "lottery-crawler",fallback = LotteryFeignFallback.class)
public interface LotteryFeign {

    @RequestMapping(value = "/lottery/{lotteryId}",method = RequestMethod.GET)
    LotteryVO selectLotteryInfo(@PathVariable("lotteryId")Integer lotteryId);
}

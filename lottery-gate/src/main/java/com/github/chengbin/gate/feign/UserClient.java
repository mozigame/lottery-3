package com.github.chengbin.gate.feign;

import com.github.chengbin.gate.fallback.UserClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangcb
 * @created on 2018/1/15.
 */
@FeignClient(value = "lottery-auth",fallback = UserClientHystrix.class)
public interface UserClient {

    @RequestMapping(value = "/auth/verify",method = RequestMethod.GET)
    Boolean validateToken(@RequestParam("token")String token);
}

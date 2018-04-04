package com.github.chengbin.gate.fallback;

import com.github.chengbin.gate.feign.UserClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangcb
 * @created 2018-01-15 17:54.
 */
@Component
public class UserClientHystrix implements UserClient {

    @RequestMapping(value = "/auth/verify",method = RequestMethod.GET)
    public Boolean validateToken(@RequestParam("token")String token){
        return Boolean.FALSE;
    }
}

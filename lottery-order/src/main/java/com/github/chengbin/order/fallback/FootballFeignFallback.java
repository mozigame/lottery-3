package com.github.chengbin.order.fallback;

import com.github.chengbin.order.feign.FootballFeign;
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
public class FootballFeignFallback implements FootballFeign {

    @RequestMapping(value = "/football/checkMatchIsOver",method = RequestMethod.GET)
    public Boolean checkMatchIsOver(@RequestParam("betType") Integer betType,
                                                 @RequestParam("pass") String pass,
                                                 @RequestParam("schemeNumber") String schemeNumber){
        return true;
    }
}

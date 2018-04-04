package com.github.chengbin.gate.filter;

import com.github.chengbin.gate.feign.UserClient;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/14.
 */
@Slf4j
@Component
public class AccessFilter extends ZuulFilter {

    @Value("${gate.ignore.startWith}")
    private String startWith;

    @Value("${zuul.prefix:/api}")
    private String zuulPrefix;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private UserClient userClient;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        final String requestUri = request.getRequestURI().substring(zuulPrefix.length());
        if(isStartWith(requestUri)){
            //指定路径不拦截
            return null;
        }
        //1.从header中获取token
        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(tokenHead)) {
            final String authToken = authHeader.substring(tokenHead.length()); // The part after "Bearer "
            boolean result = userClient.validateToken(authToken);
            if(result){
                return null;
            }
        }
        log.warn("token is empty");
        requestContext.setSendZuulResponse(false);
        requestContext.setResponseStatusCode(401);
        try {
            requestContext.getResponse().getWriter().write("token is empty");
        }catch (Exception e){}
        return null;
    }

    public boolean isStartWith(String url){
        for (String start : startWith.split(",")) {
            if(url.startsWith(start)){
                return true;
            }
        }
        return false;
    }
}

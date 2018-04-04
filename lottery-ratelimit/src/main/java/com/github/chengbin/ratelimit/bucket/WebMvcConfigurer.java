package com.github.chengbin.ratelimit.bucket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author zhangcb
 * @created 2018-01-30 13:47.
 */
@Configuration
public class WebMvcConfigurer  extends WebMvcConfigurerAdapter {
    private Logger logger = LoggerFactory.getLogger(WebMvcConfigurer.class);
    @Autowired
    private JedisPool jedisPool;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptorAdapter() {
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                                     Object handler) throws Exception {
                HandlerMethod handlerMethod = (HandlerMethod) handler;
                Method method = handlerMethod.getMethod();
                RateLimiter rateLimiter = method.getAnnotation(RateLimiter.class);

                if (rateLimiter != null){
                    int limit = rateLimiter.limit();
                    int timeout = rateLimiter.timeout();
                    Jedis jedis = jedisPool.getResource();
                    String token = RedisRateLimiter.acquireTokenFromBucket(jedis, limit, timeout);
                    if (token == null) {
                        response.sendError(500);
                        return false;
                    }
                    logger.debug("token -> {}",token);
                    jedis.close();
                }
                return true;
            }
        }).addPathPatterns("/*");
    }
}

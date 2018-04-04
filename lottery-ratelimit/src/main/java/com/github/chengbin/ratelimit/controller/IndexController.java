package com.github.chengbin.ratelimit.controller;

import com.github.chengbin.ratelimit.bucket.RateLimiter;
import com.github.chengbin.ratelimit.bucket.RedisRateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangcb
 * @created 2018-01-30 13:46.
 */
@RestController
public class IndexController {

    private static final Integer LIMIT = 100;
    private static final Long TIMEOUT = 10000l;
    private JedisPool jedisPool;

    @GetMapping("/")
    public void index(HttpServletResponse response) throws IOException {
        Jedis jedis = jedisPool.getResource();
        String token = RedisRateLimiter.acquireTokenFromBucket(jedis, LIMIT, TIMEOUT);
        if (token == null) {
            response.sendError(500);
        }else{
            //TODO 你的业务逻辑
        }
        jedisPool.returnResource(jedis);
    }

    @RateLimiter(limit = 2, timeout = 5000)
    @GetMapping("/test")
    public void test(HttpServletResponse response) throws IOException {

    }
}

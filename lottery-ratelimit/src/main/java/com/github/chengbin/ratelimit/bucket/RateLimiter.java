package com.github.chengbin.ratelimit.bucket;

import java.lang.annotation.*;

/**
 * @author zhangcb
 * @created 2018-01-30 13:48.
 * 限流注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimiter {
    int limit() default 5;
    int timeout() default 1000;
}

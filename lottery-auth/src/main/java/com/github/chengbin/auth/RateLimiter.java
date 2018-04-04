package com.github.chengbin.auth;

import java.lang.annotation.*;

/**
 * @author zhangcb
 * @created on 2018/2/2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimiter {

    int count() default 5;

    int timeout() default 1000;
}

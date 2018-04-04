package com.github.chengbin.auth.reflect;

import java.lang.annotation.*;

/**
 * @author zhangcb
 * @created on 2018/2/2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TimeAdvice{
    Class<? extends TimeAdviceListener> listener();
}

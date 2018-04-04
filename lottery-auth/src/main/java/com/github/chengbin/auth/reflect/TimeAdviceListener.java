package com.github.chengbin.auth.reflect;

/**
 * 注解监听器
 * @author zhangcb
 * @created 2018-02-02 18:19.
 */
public class TimeAdviceListener {

    public TimeAdviceListener() {
        init();
    }

    public void init(){
        System.out.println("注解监听器进来了..");
    }

    public void handler(){
        //TODO 处理逻辑
    }
}

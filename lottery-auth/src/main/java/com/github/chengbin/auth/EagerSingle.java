package com.github.chengbin.auth;

/**
 * 内部类
 * @author zhangcb
 * @created 2018-01-31 16:44.
 * 饿汉单例模式实现延迟加载
 */
public class EagerSingle {

    private static class Singleton{
        private static final EagerSingle instance = new EagerSingle();
    }

    private EagerSingle(){

    }

    public static EagerSingle getInstance(){
        return Singleton.instance;
    }
}

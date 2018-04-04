package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-01-31 14:37.
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}

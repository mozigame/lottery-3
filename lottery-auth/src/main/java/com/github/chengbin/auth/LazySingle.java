package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created on 2018/1/31.
 */
public class LazySingle {
    private static LazySingle instance = null;

    private LazySingle(){

    }
    public static LazySingle getInstance(){
        if(instance == null){
            synchronized (LazySingle.class){
                if(instance == null){
                    return new LazySingle();
                }
            }
        }
        return instance;
    }
}

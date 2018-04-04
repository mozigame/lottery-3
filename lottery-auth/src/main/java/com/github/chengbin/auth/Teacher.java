package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-01-31 17:17.
 */
public class Teacher implements People {
    @Override
    public void sleep() {
        System.out.println("teacher sleep!");
    }

    @Override
    public void work() {
        System.out.println("teacher teach!");
    }
}

package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-01-31 17:18.
 */
public class Student implements People {
    @Override
    public void sleep() {
        System.out.println("student sleep!");
    }

    @Override
    public void work() {
        System.out.println("student study!");
    }
}

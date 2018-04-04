package com.github.chengbin.auth;

/**
 * 目标对象
 * @author zhangcb
 * @created 2018-02-01 10:05.
 */
public class UserDao implements IUserDao {
    @Override
    public void add() {
        System.out.println("目标对象调用add方法");
    }

    @Override
    public void delete() {
        System.out.println("目标对象调用delete方法");
    }

    @Override
    public void update() {
        System.out.println("目标对象调用update方法");
    }

    @Override
    public void select() {
        System.out.println("目标对象调用select方法");
    }
}

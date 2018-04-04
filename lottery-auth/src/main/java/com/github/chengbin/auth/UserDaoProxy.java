package com.github.chengbin.auth;

/**
 * 代理对象
 * 静态代理
 * @author zhangcb
 * @created 2018-02-01 10:06.
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        long t1 = System.currentTimeMillis();
        System.out.println("方法调用开始时间:" + t1);
        userDao.add();  //调用目标对象方法
        System.out.println("方法调用共耗时:" + (System.currentTimeMillis() - t1)/1000);
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void select() {

    }
}

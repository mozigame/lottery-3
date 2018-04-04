package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-02-01 10:09.
 */
public class ProxyTest {

    public static void main(String[] args) {
        //1.静态代理
//        IUserDao userDao = new UserDao();
//        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
//        userDaoProxy.add();
        //JDK动态代理
//        IUserDao userDao = new UserDao();
//        System.out.println("目标对象：" + userDao.getClass());
//        ProxyFactory proxyFactory = new ProxyFactory(userDao);
//        IUserDao proxy = (IUserDao)proxyFactory.getProxyInstance();
//        System.out.println("代理对象：" + proxy.getClass());
//        proxy.add();

        //CGLIB动态代理
        IUserDao userDao = new UserDao();
        System.out.println("目标对象：" + userDao.getClass());
        CglibProxy cglibProxy = new CglibProxy(userDao);
        IUserDao proxy = (IUserDao)cglibProxy.getProxyInstance();
        System.out.println("代理对象：" + proxy.getClass());
        proxy.add();
    }
}

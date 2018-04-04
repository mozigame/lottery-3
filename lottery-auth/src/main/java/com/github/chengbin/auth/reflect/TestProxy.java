package com.github.chengbin.auth.reflect;

import java.lang.reflect.Method;

/**
 * @author zhangcb
 * @created 2018-02-02 17:05.
 */
public class TestProxy {

    public static void main(String[] args) {
//        IUserDao userDao = new UserDao();
//        ProxyFactory proxyFactory = new ProxyFactory(userDao);
//
//        IUserDao proxy = (IUserDao)proxyFactory.getInstance();
//        User user = new User("zhangsan");
//        proxy.insert(user);
//        System.out.println(user.getId());
        IUserDao userDao = new UserDao();
        User user = new User("zhangsan");
        Class<?> clazz = userDao.getClass();
        for (Method method : clazz.getMethods()) {
            TimeAdvice timeAdvice = method.getAnnotation(TimeAdvice.class);
            if(timeAdvice != null){
                //TODO 相关操作
            }
        }
        userDao.insert(user);
        System.out.println(user.getId());
    }
}

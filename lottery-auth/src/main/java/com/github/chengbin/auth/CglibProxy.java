package com.github.chengbin.auth;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB动态代理
 *
 * @author zhangcb
 * @created 2018-02-01 10:20.
 */
public class CglibProxy implements MethodInterceptor {
    //目标对象
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        long t1 = System.currentTimeMillis();
        System.out.println("方法"+ method.getName()+"调用开始时间:" + t1);
        Object returnValue = method.invoke(target,args);  //调用目标对象方法
        System.out.println("方法"+method.getName()+"调用共耗时:" + (System.currentTimeMillis() - t1)/1000);
        return returnValue;
    }
}

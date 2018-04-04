package com.github.chengbin.auth;

import com.github.chengbin.auth.controller.AuthController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/3/1.
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        ac.getBean(AuthController.class);
    }
}

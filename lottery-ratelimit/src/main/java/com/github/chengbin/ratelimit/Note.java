package com.github.chengbin.ratelimit;

/**
 * @author zhangcb
 * @created on 2018/1/30.
 */
public interface Note {

    /**
     * 实际场景中常用的限流策略：
     *1.Nginx接入层限流
     *  按照一定的规则如帐号、IP、系统调用逻辑等在Nginx层面做限流
     *2.业务应用系统限流
     *  通过业务代码控制流量这个流量可以被称为信号量，可以理解成是一种锁，它可以限制一项资源最多能同时被多少进程访问。
     */

    /**
     * 这里以业务应用系统限购为主，三种实现：
     * 1.bucket
     * 2.将lottery-ratelimit打成jar包，配置一下即可
     * 3.spring-cloud-zuul-ratelimit
     * <dependency>
     <groupId>com.marcosbarbero.cloud</groupId>
     <artifactId>spring-cloud-zuul-ratelimit</artifactId>
     <version>1.3.4.RELEASE</version>
     </dependency>
     *
     * */
}

package com.github.chengbin.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients({"com.github.chengbin.order.feign"})
@SpringBootApplication
@MapperScan("com.github.chengbin.order.mapper")
public class LotteryOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryOrderApplication.class, args);
	}
}

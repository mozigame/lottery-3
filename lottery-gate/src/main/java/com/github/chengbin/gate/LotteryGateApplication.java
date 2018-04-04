package com.github.chengbin.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableFeignClients({"com.github.chengbin.gate.feign"})
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class LotteryGateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryGateApplication.class, args);
	}
}

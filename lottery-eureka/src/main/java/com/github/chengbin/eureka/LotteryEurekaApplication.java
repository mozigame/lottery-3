package com.github.chengbin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LotteryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryEurekaApplication.class, args);
	}
}

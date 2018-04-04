package com.github.chengbin.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class LotteryMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryMonitorApplication.class, args);
	}
}

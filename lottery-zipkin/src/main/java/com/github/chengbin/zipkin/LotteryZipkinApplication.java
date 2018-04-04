package com.github.chengbin.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableEurekaClient
@EnableZipkinStreamServer
@SpringBootApplication
public class LotteryZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryZipkinApplication.class, args);
	}
}

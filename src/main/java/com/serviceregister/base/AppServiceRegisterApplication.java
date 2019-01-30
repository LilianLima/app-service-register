package com.serviceregister.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceRegisterApplication.class, args);
	}

}


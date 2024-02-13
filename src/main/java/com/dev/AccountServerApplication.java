package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AccountServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServerApplication.class, args);
	}

}

package com.dber.registerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class RegisterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServerApplication.class, args);
	}
}

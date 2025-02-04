package com.project.AuthenticationMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AuthenticationMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AuthenticationMicroserviceApplication.class, args);
	}

}

package com.wipro.Health_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HealthApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthApiGatewayApplication.class, args);
	}

}

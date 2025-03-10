package com.wipro.Health_Service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HealthServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthServiceRegistryApplication.class, args);
	}

}

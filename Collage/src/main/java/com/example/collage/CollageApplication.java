package com.example.collage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CollageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollageApplication.class, args);
	}

}

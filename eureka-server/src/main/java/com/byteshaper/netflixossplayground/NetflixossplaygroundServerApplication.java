package com.byteshaper.netflixossplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixossplaygroundServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixossplaygroundServerApplication.class, args);
	}
}

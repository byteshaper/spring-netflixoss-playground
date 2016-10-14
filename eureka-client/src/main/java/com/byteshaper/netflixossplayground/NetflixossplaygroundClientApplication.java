package com.byteshaper.netflixossplayground;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class NetflixossplaygroundClientApplication {
    
    @Autowired
    private DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(NetflixossplaygroundClientApplication.class, args);
	}
	
	@RequestMapping("/playground/instances")
	public List<ServiceInstance> getServiceInstances() {
	    return this.discoveryClient.getInstances("a-really-awesome-client");
	}
}

package com.nttdata.gateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GateserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateserviceApplication.class, args);
	}

}

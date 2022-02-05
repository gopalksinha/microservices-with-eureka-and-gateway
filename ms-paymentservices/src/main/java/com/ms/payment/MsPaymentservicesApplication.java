package com.ms.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsPaymentservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPaymentservicesApplication.class, args);
	}

}

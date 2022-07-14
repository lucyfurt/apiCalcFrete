package com.apiFrete.api.cepFrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiCepFreteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCepFreteApplication.class, args);
	}


}

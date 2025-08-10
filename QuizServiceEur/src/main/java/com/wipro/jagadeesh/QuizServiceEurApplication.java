package com.wipro.jagadeesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.wipro.jagadeesh.Fein")
public class QuizServiceEurApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceEurApplication.class, args);
	}

}

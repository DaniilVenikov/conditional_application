package com.example.conditional_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConditionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConditionalApplication.class, args);
	}

	@GetMapping("/")
	private String hello(){
		return "Hello from app!";
	}
}

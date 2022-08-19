package com.sample.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstJenkinApplication {

	@GetMapping("/message")
	public String message(String message) {
		return "Welcome to Jenkins after change...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FirstJenkinApplication.class, args);
	}

}

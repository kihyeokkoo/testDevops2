package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestDevops2Application {

	private  int A = 1;
	@RequestMapping("/")
	public String greetings() {
		A = A + 1;
		return "Spring boot Start on Java" + Integer.toString(A+1);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestDevops2Application.class, args);
	}

}

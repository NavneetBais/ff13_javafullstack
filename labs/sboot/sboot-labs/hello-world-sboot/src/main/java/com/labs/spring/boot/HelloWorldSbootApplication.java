package com.labs.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSbootApplication.class, args);
		System.out.println("Hello Spring boot ");
	}

}

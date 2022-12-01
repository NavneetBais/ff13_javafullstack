package com.labs.sboot.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.labs.sboot.task.models.Order;

@SpringBootApplication
public class OrderItemRestApplication implements CommandLineRunner {
	static ApplicationContext ctx ; 
	public static void main(String[] args) {
		SpringApplication.run(OrderItemRestApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
	
		
		
	}

}

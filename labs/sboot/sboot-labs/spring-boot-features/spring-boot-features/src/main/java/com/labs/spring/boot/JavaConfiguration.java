package com.labs.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfiguration {
	
@Bean
public  Order order() {
	return new Order(Arrays.asList(samosa()));	// constructor injection
    
}


@Bean
public Item samosa() {
	return new Item(11,"Samosa", 20, 150 , "Indian" , true);
}
}

package com.labs.sboot.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import com.labs.sboot.task.models.Item;
import com.labs.sboot.task.models.Order;

@Configuration
public class AppConfig {

	@Bean
	public Order order() {
		Order order = new Order(1 , 250 ,  Arrays.asList(item()) ,"Navneet"  );
		return order; 
		
	}
	
	@Bean
	public Item item() {
		return new Item (1 , 100 , "Kadhai Paneer" , "Veg");
	}
	

}

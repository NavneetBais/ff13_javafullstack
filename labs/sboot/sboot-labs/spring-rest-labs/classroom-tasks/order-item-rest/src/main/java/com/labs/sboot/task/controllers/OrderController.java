package com.labs.sboot.task.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labs.sboot.task.models.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	static ApplicationContext ctx ;
	
	
	

	
	@GetMapping(value = "/{id}" , params = "id", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Order order(@RequestParam int id){
		Order o = ctx.getBean("order",Order.class);
		o.setOrderId(id);
		return o ;
	}
	
	
}

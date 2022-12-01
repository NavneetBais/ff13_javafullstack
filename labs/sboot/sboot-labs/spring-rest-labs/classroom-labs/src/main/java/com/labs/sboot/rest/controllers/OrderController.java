package com.labs.sboot.rest.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
	
	
	@RequestMapping(path ="/orders", method=RequestMethod.POST ,produces=MediaType.TEXT_PLAIN_VALUE)
	public String order() {
		return "This is Order Page" ;
	}
		
	
}

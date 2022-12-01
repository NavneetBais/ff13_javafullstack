package com.labs.sboot.rest.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "This is Home Page" ;
	}

}

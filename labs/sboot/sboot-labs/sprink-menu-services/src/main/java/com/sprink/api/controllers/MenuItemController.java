package com.sprink.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprink.api.exceptions.MenuItemNotFound;
import com.sprink.api.model.MenuItem;
import com.sprink.api.model.ResponseMessage;
import com.sprink.api.services.MenuItemServiceImpl;

@RestController
@RequestMapping("/items")
public class MenuItemController {
	
	@Autowired
	MenuItemServiceImpl menuService ;
	
	@PostMapping
	public ResponseMessage createItem(@RequestBody MenuItem item) {
		menuService.createItem(item);
		ResponseMessage msg = new ResponseMessage();
		msg.setMessage("Created");
		msg.setStatus("Success");
		return msg;
	}
	
	@GetMapping
	public List<MenuItem> getAllItems(){
		return menuService.getAllItems() ;
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseMessage deleteItem(@PathVariable int id) {
		return menuService.deleteItem(id) ; 
	}
	
	@PutMapping("/{id}")
	public ResponseMessage updateItem(@PathVariable int id) throws MenuItemNotFound {
		Optional<MenuItem> item = menuService.getItem(id);
		menuService.updateItem(item, id);
		ResponseMessage msg = new ResponseMessage();
		msg.setMessage("Updated");
		msg.setStatus("Success");
		return null ;
	}
}

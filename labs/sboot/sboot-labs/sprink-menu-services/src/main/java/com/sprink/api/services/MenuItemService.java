package com.sprink.api.services;

import java.util.List;
import java.util.Optional;

import com.sprink.api.exceptions.MenuItemNotFound;
import com.sprink.api.model.MenuItem;
import com.sprink.api.model.ResponseMessage;

public interface MenuItemService {
	
	public MenuItem createItem(MenuItem item);
	public List<MenuItem> getAllItems();
	public Optional<MenuItem> getItem(int id);
	public ResponseMessage deleteItem( int id);
	public MenuItem updateItem(Optional<MenuItem> item , int id) throws MenuItemNotFound; 
	
	
}

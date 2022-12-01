package com.sprink.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprink.api.exceptions.MenuItemNotFound;
import com.sprink.api.model.MenuItem;
import com.sprink.api.model.ResponseMessage;
import com.sprink.api.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	
	@Autowired
	MenuItemRepository menuRepo ;
	@Override
	public MenuItem createItem(MenuItem item) {
		// TODO Auto-generated method stub
		return menuRepo.save(item);
	}

	@Override
	public List<MenuItem> getAllItems() {
		// TODO Auto-generated method stub
		
		return menuRepo.findAll();
	}

	@Override
	public ResponseMessage deleteItem(int id) {
		// TODO Auto-generated method stub
		
		menuRepo.deleteById(id);
		ResponseMessage msg = new ResponseMessage();
		msg.setStatus("Success");
		msg.setMessage("Item Deleted.");
		return msg;
	}

	@Override
	public MenuItem updateItem(Optional<MenuItem> item, int id) throws MenuItemNotFound {
		// TODO Auto-generated method stub
		Optional<MenuItem> itemToUpdate = menuRepo.findById(id);
		if(itemToUpdate == null) {
			throw new MenuItemNotFound("Item not available to be updated with id" + id);
		}
		return menuRepo.save(item) ;
	}

	@Override
	public Optional<MenuItem> getItem(int id) {
		// TODO Auto-generated method stub
		return menuRepo.findById(id);
	}



}

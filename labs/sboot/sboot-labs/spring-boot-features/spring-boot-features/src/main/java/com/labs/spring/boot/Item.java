package com.labs.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Item {
	private int itemId ;
	private String itemName ; 
	private int quantity ; 
	private double price ; 
	private String cuisine ; 
	private boolean veg ;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public Item(int itemId, String itemName, int quantity, double price, String cuisine, boolean veg) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.cuisine = cuisine;
		this.veg = veg;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ ", cuisine=" + cuisine + ", veg=" + veg + "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	} 
	
	
}

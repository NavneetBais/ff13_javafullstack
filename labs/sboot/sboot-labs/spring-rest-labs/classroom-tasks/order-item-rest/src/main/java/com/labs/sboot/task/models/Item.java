package com.labs.sboot.task.models;

public class Item {
	private int itemId ; 
	private double price ; 
	private String itemName ; 
	private String type ;
	public Item(int itemId, double price, String itemName, String type) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.itemName = itemName;
		this.type = type;
	}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + ", itemName=" + itemName + ", type=" + type + "]";
	} 
	
}

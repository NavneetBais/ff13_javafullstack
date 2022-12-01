package com.labs.sboot.task.models;

import java.time.LocalDate;

import java.util.List;


public class Order {
	private int orderId ; 
	private double amount ; 
	
	private List<Item> item ;
	private String orderedBy ; 
	private LocalDate orderDate = LocalDate.now();
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public String getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", item=" + item + ", orderedBy=" + orderedBy
				+ ", orderDate=" + orderDate + "]";
	}
	public Order(int orderId, double amount, List<Item> item, String orderedBy) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.item = item;
		this.orderedBy = orderedBy;
	
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	
}

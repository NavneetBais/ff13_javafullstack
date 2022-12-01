package com.labs.spring.boot;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Order {
	private int id ; 
	private String status ; 
	private double totalAmount  ;
	private String orderBy ; 
	private String orderDate  ; 
	private List<Item> items ;
	public int getId() {
		return id;
	}
	public Order() {
		
	}
	
	public Order(List<Item> items) {
		super();
		this.items = items;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", totalAmount=" + totalAmount + ", orderBy=" + orderBy
				+ ", orderDate=" + orderDate + ", items=" + items + "]";
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	} 
}

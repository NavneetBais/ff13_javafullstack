package com.sprink.api.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class MenuItem {
	@Id
	@GeneratedValue
	private int id ; 
	private String itemName ; 
	private double price ;
	private String description ; 
	private MealSession sessionType ; 
	private String createdBy ; 
	private PortionSize size ;
	private Cuisine cuisineType ; 
	private ItemType type ; 
	
}

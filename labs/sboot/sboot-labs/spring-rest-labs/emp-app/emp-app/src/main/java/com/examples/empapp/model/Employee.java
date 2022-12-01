package com.examples.empapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Models employee object
 */
@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	@NotEmpty
	private String name;
	private int age;
	private String department;
	private String designation;
	private String country;
	
	
	public Employee()
	{
		
	}
	
	

	public Employee(int id, @NotNull @NotEmpty String name, int age, String department, String designation,
			String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.designation = designation;
		this.country = country;
	}



	public int getEmpId() {
		return id;
	}

	public void setEmpId(int empId) {
		this.id = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}

package com.API.SpringBoot_API;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="API_Details")
public class SpringBoot_APIModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",length=50,nullable=true)
	private String name;
	
	@Column(name="roll_Num",length=15,nullable=true)
	private String rollnum;
	
	@Column(name="department",length=50,nullable=true)
	private String department;

	public SpringBoot_APIModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollnum;
	}

	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}

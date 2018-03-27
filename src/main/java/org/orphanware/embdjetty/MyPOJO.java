package org.orphanware.embdjetty.rest;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class MyPOJO {

	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;

	//getters and setters
	public MyPOJO() {
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}	
	
	public void setListSkills(List<String> skills) {  
		this.skills = new ArrayList<String>(skills);  
	}  
	  
	public List<String> getListSkills() {  
		return new ArrayList<String>(this.skills);  
	}  
}
package com.hcl.bankapp;

public class Employee extends Person{
	
	private String id; 
	
	/**
	 * Constructor
	 * @param name The name of the employee
	 * @param age The age of the employee
	 * @param id The id of the employee
	 */
	public Employee(String name, int age, String id) {
		super(name,age);
		this.id = id;
	}
	
	/**
	 * Returns the id of the employee
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Modifies the id of the employee
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
}

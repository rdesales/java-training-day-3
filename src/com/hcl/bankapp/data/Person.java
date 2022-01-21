/**
 * 
 */
package com.hcl.bankapp.data;

import java.util.Objects;

/**
 * @author rdesales
 * Class Person
 */
public abstract class Person {
	
	private String name;
	private int age;
	
	/**
	 * Constructor
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Returns the name of the person
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifies the name of the person
	 * @param name A string with the name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the age of the person
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Modifies the age of the person
	 * @param age An integer which is the new age of the person
	 */
	public void setAge(int age) {
		this.age = age;
	} 
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
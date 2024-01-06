package com.goonok.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	//@Value("2130")
	private String id;

	//@Value("Alamin")
	private String name;

	private Address address;

	
	  public Student(String id, String name, Address address) {
		  this.id = id; 
		  this.name = name; 
		  this.address = address; 
		  }
	 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}

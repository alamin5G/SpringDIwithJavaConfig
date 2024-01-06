package com.goonok.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.goonok.beans.Address;
import com.goonok.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Student student() {
		//now we are setting the Dependency Injection with Constructor
		Student st = new Student("2122", "Nuha", address());
		
		st.setAddress(address());
		return st;
		
	}
	
	@Bean
	public Address address() {
		Address addr = new Address("Tongi", "Gazipur", "1705");
		
		return addr;
	}
	

}

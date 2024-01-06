package com.goonok.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.goonok.beans.Address;
import com.goonok.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Student student() {
		Student st = new Student();
		
		st.setAddress(address());
		return st;
		
	}
	
	@Bean
	public Address address() {
		Address addr = new Address();
		
		return addr;
	}
	

}

package com.goonok.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.goonok.beans.Student;
import com.goonok.config.SpringConfig;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student st = context.getBean("student", Student.class);
		
		System.out.println(st);
	}
}

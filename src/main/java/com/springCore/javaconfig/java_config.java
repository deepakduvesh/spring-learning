package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springCore.javaconfig")
public class java_config {
	@Bean 
	public Item getItem() {
		return new Item();
	}
	
	@Bean(name = {"student", "temp", "con"}) //we can also use these name
	public Student getStudent() {
		Student student = new Student(getItem());
		return student;
	}
}
package com.springCore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/constructor/constructor_config.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
	}

}

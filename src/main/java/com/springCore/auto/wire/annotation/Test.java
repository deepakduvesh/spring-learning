package com.springCore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/auto/wire/annotation/autowire_config.xml");
		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println(emp1);

	}

}

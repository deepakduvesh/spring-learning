package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/ref_config.xml");
		A a1 = (A) context.getBean("aref");
		System.out.println(a1.getX());
		System.out.println(a1.getObj().getY());
		System.out.println(a1);

	}

}

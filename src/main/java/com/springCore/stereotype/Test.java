package com.springCore.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/stereotype/stereotype_config.xml");
		Student student = context.getBean("student", Student.class);
//		Student student = context.getBean("object", Student.class);
		System.out.println(student);
	}

}

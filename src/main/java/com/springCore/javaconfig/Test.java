package com.springCore.javaconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(java_config.class);
		
//		Student student = context.getBean("student", Student.class);
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.study();

	}

}

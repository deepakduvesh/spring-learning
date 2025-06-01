//implementing life cycle method using xml

package com.springCore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifecycle_config.xml");
		Item item1 = (Item) context.getBean("item1");
		System.out.println(item1);
		//registering shutdown hook
		context.registerShutdownHook();
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(p1);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Example e1 = (Example) context.getBean("example");
		System.out.println(e1);
	}

}

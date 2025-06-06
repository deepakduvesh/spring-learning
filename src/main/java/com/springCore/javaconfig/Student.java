package com.springCore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component
public class Student {
	private Item item;
	
	public Student(Item item) {
		super();
		this.item = item;
		System.out.println("i am here");
	}
	public void study() {
		item.display();
		System.out.println("this is student class");
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}

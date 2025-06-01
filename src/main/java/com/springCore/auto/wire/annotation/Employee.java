package com.springCore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
//	@Autowired
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}
	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("inside setter");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}

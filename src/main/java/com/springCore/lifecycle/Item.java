//implementing life cycle method using xml

package com.springCore.lifecycle;

public class Item {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("initialization method");
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}
}

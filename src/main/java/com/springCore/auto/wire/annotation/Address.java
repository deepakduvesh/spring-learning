package com.springCore.auto.wire.annotation;

public class Address {
	private String city;
	private String street;
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	public String getCity() {
		return city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
}

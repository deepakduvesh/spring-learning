package com.springCore.constructor;

public class Certificate {
	private String certi;

	public Certificate(String certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Certificate [certi=" + certi + "]";
	}
	
}

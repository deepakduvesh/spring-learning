package com.springCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Component("object")
public class Student {
//	don't use constructor while stereotype because spring give priority to constructor, if you have not created bean for constructor then it will give error so 
	
//	public Student(List<String> address, String studentName, String city) {
//		super();
//		this.address = address;
//		this.studentName = studentName;
//		this.city = city;
//	}
	@Value("#{listxml}")
	private List<String> address;
	@Value("deepak duvesh")
	private String studentName;
	@Value("rajasthan")
	private String city;
	@Value("#{T(java.lang.Math).sqrt(50)}")
	private double x;
	@Override
	public String toString() {
		return "Student [address=" + address + ", studentName=" + studentName + ", city=" + city + ", x=" + x + "]";
	}
//	public List<String> getAddress() {
//		return address;
//	}
//	public void setAddress(List<String> address) {
//		this.address = address;
//	}
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
}

package com.springautoxml.AutowiringAnnotationStereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// @Component("OB") // if we run student as a object it will give file not found exception
@Component
public class student {
	
	@Value("Hare Krishna")
	private String studentName;
	@Value("Sanpada")
	private String city;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	

}

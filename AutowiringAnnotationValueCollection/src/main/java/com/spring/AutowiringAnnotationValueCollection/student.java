package com.spring.AutowiringAnnotationValueCollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class student {
	
	@Value("Hare Krishna")
	private String studentName;
	@Value("Sanpada")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;
	
	
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
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	
	
	
	

}

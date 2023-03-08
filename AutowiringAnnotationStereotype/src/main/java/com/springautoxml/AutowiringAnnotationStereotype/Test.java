package com.springautoxml.AutowiringAnnotationStereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		student student=context.getBean("student",student.class);
		
		System.out.println(student);

	}

}

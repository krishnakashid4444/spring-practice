package com.SpringOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringOrm.dao.StudentDao;
import com.SpringOrm.entity.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentDao studentdao = context.getBean("studentdao", StudentDao.class);
		
		
		Student student = new Student (2324, "krishna kashid", "sanpada");
		
		int r = studentdao.insert(student);
		
		System.out.println("done" + r);
		

	}

}

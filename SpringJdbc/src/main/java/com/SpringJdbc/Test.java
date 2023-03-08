package com.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("spring jdbc------>");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JdbcTemplate template=context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		
		//insert Query
		
		String qry="insert into info (id,name,city) values(?,?,?)";
		
		int result = template.update(qry,46,"kumar","Bandra");
		
		System.out.println("records save successfully"+result);
		
		
	}

}

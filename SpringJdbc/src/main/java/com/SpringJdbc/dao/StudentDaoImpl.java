package com.SpringJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJdbc.Entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		// insert query
		
		String qry = "insert into info (id,name,city) values(?,?,?)";
		int r =this.jdbcTemplate.update(qry,student.getId(),student.getName(),student.getCity());
		
		return r;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	
	

}

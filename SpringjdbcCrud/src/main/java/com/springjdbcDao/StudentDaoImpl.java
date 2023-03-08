package com.springjdbcDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbcEntity.Student;

public class StudentDaoImpl implements StudentDao{
	
	
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		String qry = "insert into info (id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(qry,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	public int update(Student student) {
		// TODO Auto-generated method stub
		
		
		String qry="update info set name=?,  city=? where id=?";
		int r = this.jdbcTemplate.update(qry,student.getName(),student.getCity(),student.getId());
		return r;
	}




	public int delete(int studentId) {
		// TODO Auto-generated method stub
		
		String qry="delete from info where id=?";
		int r = this.jdbcTemplate.update(qry,studentId);
		return r;
	}




	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		
		// single student data
		
		String qry="select * from info where id=?";
		
		RowMapper<Student> rowMapper = new RowMappaerImpl();
		Student student = this.jdbcTemplate.queryForObject(qry,rowMapper,studentId);
		
		
		
		
		return student;
	}




	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		// selecting multiple student
		
		String qry="select * from info ";
		List<Student> students = this.jdbcTemplate.query(qry,new RowMappaerImpl());
		return students;
		
		
		
	}
	
	
	
	
	

}

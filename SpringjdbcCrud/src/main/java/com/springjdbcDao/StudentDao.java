package com.springjdbcDao;

import java.util.List;

import com.springjdbcEntity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	
	
	
	
	

}

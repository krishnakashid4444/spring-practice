package com.springjdbccrud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcDao.StudentDao;
import com.springjdbcEntity.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("spring jdbc------>");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		// insert
		//Student student =new Student();
		//student.setId(47);
		//student.setName("saga");
		//student.setCity("kharghar");
		
		//int result=studentDao.insert(student);
		//System.out.println("student added.. "+result);
		
		// update
		//Student student =new Student();
		
		///student.setId(46);
		//student.setName("gauri");
		//student.setCity("Thane");
		
		//int r = studentDao.update(student);
		
		//System.out.println("data updated..."+r);
		         
		
		// Delete //
		//int result=studentDao.delete(46);
		//System.out.println("delete..."+result);
		
		// single object
		
		//Student student=studentDao.getStudent(45);
		//System.out.println(student);
		
		
		// multiple object
		List<Student> students = studentDao.getAllStudents();
		for(Student s: students)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

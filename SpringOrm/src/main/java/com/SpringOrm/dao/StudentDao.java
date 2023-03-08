package com.SpringOrm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.SpringOrm.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	// save student
	
	@Transactional
	public int insert (Student student)
	{
		
		// insert
		
		Integer i=(Integer) this.hibernateTemplate.save(student);
		
		return i;
		
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}

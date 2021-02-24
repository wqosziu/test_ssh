package com.niit.dao;

import java.util.List;

import com.niit.bean.Student;

public interface IStudentDAO {
	public void save(Student transientInstance) ;

	public void delete(Student persistentInstance) ;

	public Student findById(java.lang.Integer id) ;

	public List findByExample(Student instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findBySname(Object sname) ;

	public List findAll() ;

	public Student merge(Student detachedInstance) ;
}

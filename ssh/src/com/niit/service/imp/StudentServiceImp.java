package com.niit.service.imp;

import java.util.List;

import com.niit.bean.Student;
import com.niit.dao.IStudentDAO;
import com.niit.service.IStudentService;

public class StudentServiceImp implements IStudentService{
	private IStudentDAO studentDAO;
	
	public IStudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(IStudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void test() {

	}
	
	public List<Student> getAllStudent(){
		return studentDAO.findAll();
	}
}

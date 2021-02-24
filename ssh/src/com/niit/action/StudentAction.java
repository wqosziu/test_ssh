package com.niit.action;

import java.util.List;

import com.niit.bean.Student;
import com.niit.service.IStudentService;

public class StudentAction {
	private List<Student> students;
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public IStudentService getiStudentService() {
		return iStudentService;
	}
	public void setiStudentService(IStudentService iStudentService) {
		this.iStudentService = iStudentService;
	}
	private IStudentService iStudentService;
	
	public String execute(){
		students  = iStudentService.getAllStudent();
		return "success";
	}
}

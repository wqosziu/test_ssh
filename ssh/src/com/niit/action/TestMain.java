package com.niit.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.niit.dao.imp.StudentDAO;

public class TestMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cc = new FileSystemXmlApplicationContext("D:\\workspace\\ssh\\WebRoot\\WEB-INF\\applicationContext.xml");
	}
}

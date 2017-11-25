package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface WelcomeService {
	
	public String getWelcomeMsg();
	
	public List<Student> retrieveStudList();
	
	public boolean addStudent(Student student);
	
	public String successMsg();
	
	public String errorMsg();

}

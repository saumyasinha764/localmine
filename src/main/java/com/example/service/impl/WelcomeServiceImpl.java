package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.service.WelcomeService;

@Service
public class WelcomeServiceImpl implements WelcomeService{

	@Override
	public String getWelcomeMsg() {
		return "Hello World! Welcome Msg";
	}

	@Override
	public List<Student> retrieveStudList() {
		
		List<Student> studList = new ArrayList<Student>();
		
		Student stud1 = new Student("Saumya",26,"MCA","Bangalore");
		studList.add(stud1);
		
		Student stud2 = new Student("Surbhi",23,"BCA","Bangalore");
		studList.add(stud2);
		
		Student stud3 = new Student("Sandy",28,"BE","Bangalore");
		studList.add(stud3);
		
		Student stud4 = new Student("Naina",26,"MCA","Ranchi");
		studList.add(stud4);
		
		Student stud5 = new Student("Aakriti",26,"MBA","Bangalore");
		studList.add(stud5);
		
		return studList;
	}

	@Override
	public boolean addStudent(Student student) {
		
		List<Student> studList = new ArrayList<Student>();
		return studList.add(student);
	}

	@Override
	public String successMsg() {
		return "Student added successfully";
	}

	@Override
	public String errorMsg() {
		return "Error while adding student";
	}

}


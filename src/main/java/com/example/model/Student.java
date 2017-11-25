package com.example.model;

public class Student {
	
	private String name;
	private int age;
	private String course;
	private String city;
	
	
	public Student() {
		super();
	}

	public Student(String name, int age, String course, String city) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

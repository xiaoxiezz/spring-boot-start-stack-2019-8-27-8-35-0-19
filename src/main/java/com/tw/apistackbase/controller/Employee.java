package com.tw.apistackbase.controller;


public class Employee {
	private String id;
	private String name;
	private int age;
	private String gender;
	public Employee(String id, String name, int age, String gender) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public Employee() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}

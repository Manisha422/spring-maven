package com.av.dto;

public class Teacher {
	int id;
	String name;
	double salary;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}

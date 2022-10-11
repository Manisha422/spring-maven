package com.av.dto;

import org.springframework.stereotype.Component;

@Component
public class Person {
	int id;
	String name;
	int age;
	
	public void savePerson(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void getPerson()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}

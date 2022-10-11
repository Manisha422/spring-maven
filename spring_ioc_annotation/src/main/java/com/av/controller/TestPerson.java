package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Person;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("personspring.xml");
		Person p = (Person) applicationContext.getBean("person");
		p.savePerson(1, "manisha", 20);
		p.getPerson();
		
	}

}

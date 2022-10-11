package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Teacher;

public class J2EEContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterspring.xml");
		Teacher t=(Teacher) applicationContext.getBean("teach");
		t.display();
	}
	
}

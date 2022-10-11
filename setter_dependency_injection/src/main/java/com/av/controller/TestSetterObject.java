package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Car;

public class TestSetterObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("musicspring.xml");
		Car car = (Car) applicationContext.getBean("mycar");
		car.playingMusic.play();

	}

}

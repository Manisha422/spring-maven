package com.av;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.av.dto.Person;

@Configuration
@ComponentScan(basePackages="com.av")
public class MyConfig {
	//@Bean(value = "per")
//	public Person getPerson()
//	{
//		return new Person();
//		
//	}
	

}

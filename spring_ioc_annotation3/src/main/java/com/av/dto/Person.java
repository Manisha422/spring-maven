package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component//(value = "per")
public class Person {
	@Autowired
	Aadhar a;
	public void details()
	{
		System.out.println("manisha");
		a.number();
	}

}

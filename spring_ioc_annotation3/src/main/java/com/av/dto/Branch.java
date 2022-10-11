package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Branch {
	public Address a;
//	@Autowired
//	public void setA(Address a) {  //setter
//		this.a = a;
//	}

	public Branch(@Autowired Address a) {  //constructor
		this.a = a;
	}
	
}

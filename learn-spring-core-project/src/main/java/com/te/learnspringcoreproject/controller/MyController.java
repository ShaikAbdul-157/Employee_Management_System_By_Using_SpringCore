package com.te.learnspringcoreproject.controller;

import com.te.learnspringcoreproject.service.MYService;

public class MyController {
	private MYService myService;

	public MyController(MYService myService) {
		super();
		this.myService = myService;
	}
	
	
}

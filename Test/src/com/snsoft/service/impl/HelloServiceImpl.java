package com.snsoft.service.impl;

import com.snsoft.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name, String value) {
		return "hello," + name + "," +value;
	}
	
}

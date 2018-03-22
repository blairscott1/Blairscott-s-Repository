package com.snsoft.test;

import java.lang.reflect.Proxy;

import com.snsoft.proxy.ProxyHandler;
import com.snsoft.service.HelloService;
import com.snsoft.service.impl.HelloServiceImpl;

public class Demo01 {
	public static void main(String[] args) {
		HelloService robot = new HelloServiceImpl();
		ProxyHandler baoan = new ProxyHandler(robot);

		HelloService proxy = (HelloService) Proxy.newProxyInstance (robot.getClass().getClassLoader(),
																	robot.getClass().getInterfaces(),
																	baoan);
		System.out.println(proxy.sayHello("zhangsan", "2"));
		System.out.println(proxy.sayHello("lisi", "1"));
	}
}
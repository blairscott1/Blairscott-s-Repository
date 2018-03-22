package com.snsoft.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.snsoft.service.HelloService;

public class ProxyHandler implements InvocationHandler{

	private HelloService robot;

	public ProxyHandler(HelloService robot) {
		this.robot = robot;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("lisi".equals(args[0]) && "1".equals(args[1])) {
			return "bye," + args[0] + "," + args[1];
		}
		return method.invoke(robot, args);
	}
}

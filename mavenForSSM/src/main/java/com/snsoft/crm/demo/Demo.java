package com.snsoft.crm.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snsoft.crm.bean.CollectionBean;
import com.snsoft.crm.bean.Employee;
import com.snsoft.crm.bean.User;

public class Demo {
	@Test
	public void test01() {
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器"要"对象
		User user = (User) ac.getBean("user");
		//3.打印user对象
		System.out.println(user);
	}

	@Test
	public void test02() {
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器"要"对象
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		//3.打印user对象
		System.out.println(cb);
	}

	@Test
	public void test03() {
		//1.创建容器对象
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext02/applicationContext.xml");
		//2.向容器"要"对象
		Employee ep1 = (Employee) ac.getBean("employee");
		Employee ep2 = (Employee) ac.getBean("employee");
		System.out.println(ep1 == ep2);
		//3.打印user对象
		System.out.println(ep1);
		ac.close();
	}
}

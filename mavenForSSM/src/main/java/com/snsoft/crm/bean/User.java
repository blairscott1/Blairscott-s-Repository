package com.snsoft.crm.bean;

public class User {

	private String name;
	private Integer age;

	public User() {
		System.out.println("调用空参构造方法!!!");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void init () {
		System.out.println("我是初始化方法");
	}
	
	public void destory() {
		System.out.println("我是销毁方法");
	}
}

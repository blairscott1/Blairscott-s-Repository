package com.snsoft.crm.bean;

public class User {

	private String name;
	private Integer age;
	private Sheet sheet;

	public User() {
		System.out.println("调用空参构造方法!!!");
	}

	public Sheet getSheet() {
		return sheet;
	}
	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
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

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sheet=" + sheet + "]";
	}
}

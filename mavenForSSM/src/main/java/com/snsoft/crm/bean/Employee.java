package com.snsoft.crm.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//<bean name="employee" class="com.snsoft.crm.bean.Employee"></bean>
//@Component("employee")	:体现不出分层，不建议使用,四种注解使用方式没有区别
//@Service("employee")		:Service层
//@Controller("employee")	：web层
@Repository("employee")	//	：Dao层
//@Scope(scopeName="singleton") //默认为单例（singleton）
public class Employee {
	//@Value("Tom") 通过反射的Field赋值，破坏了封装性
	private String name;
	private Integer age;
	private Job job;

	public Employee() {
	}

	public String getName() {
		return name;
	}
	@Value("Tom")	//通过set方法赋值，推荐使用
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	@Value("18")
	public void setAge(Integer age) {
		this.age = age;
	}
	public Job getJob() {
		return job;
	}
	//@Autowired //自动装配，如果匹配多个类型一致的对象，将无法选择具体哪一个对象
	//@Qualifier("job2") //使用该注解可以指定spring容器具体某个对象
	@Resource(name="job2")	//手动注解
	public void setJob(Job job) {
		this.job = job;
	}

	@PostConstruct	//在调用构造方法之后调用
	public void init () {
		System.out.println("初始化方法");
	}

	@PreDestroy	//在对象销毁之前调用
	public void destory () {
		System.out.println("销毁方法");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
}

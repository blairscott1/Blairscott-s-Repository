package com.snsoft.crm.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.snsoft.crm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/snsoft/crm/springaop/springaop.xml")
public class SpringaopDemo {
	@Resource(name="userService")
	private UserService us;

	@Test
	public void test() {
		us.add();
	}

}

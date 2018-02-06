package com.snsoft.crm.deal;

import com.snsoft.crm.bean.User;

public class ServiceDeal {
	public static User createUser() {
		System.out.println("静态方法创建User对象");
		return new User();
	}
}

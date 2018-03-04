package com.snsoft.crm.service.impl;

import com.snsoft.crm.service.UserService;

/**
 * @author blairscott
 * 目标对象
 */
public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("添加用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void update() {
		System.out.println("修改用户");
	}

	@Override
	public void find() {
		System.out.println("查找用户");
	}
}

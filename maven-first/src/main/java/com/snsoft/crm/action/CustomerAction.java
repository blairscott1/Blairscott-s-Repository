package com.snsoft.crm.action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	private long custId;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}
	
	public String findCustomerById () {
		System.out.println("前段传过来的一个客户id是:" + custId);
		return SUCCESS;
	}

	
	
	
	
	
	
}

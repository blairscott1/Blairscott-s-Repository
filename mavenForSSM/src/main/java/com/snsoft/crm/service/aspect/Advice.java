package com.snsoft.crm.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author blairscott
 * 通知类
 *
 */
public class Advice {
	/**
	 * 前置通知:在目标方法运行之前调用
	 * 后置通知(如果出现异常,将不会调用):目标方法运行之后调用
	 * 环绕通知:在目标方法执行之前和之后都调用
	 * 异常拦截通知:如果出现异常,则调用
	 * 后置通知(无论是否出现异常,都会调用):目标方法运行之后调用
	 */

	//前置通知
	public void before() {
		System.out.println("这是前置通知");
	}

	//后置通知(如果出现异常,将不会调用)
	public void afterReturning() {
		System.out.println("这是后置通知,如果出现异常,将不会调用");
	}
	//环绕通知
	public void around(ProceedingJoinPoint pjp) {
		System.out.println("这是环绕通知");
	}
//	//异常拦截通知
//	public void after() {
//		System.out.println("这是异常拦截通知");
//	}
//	//后置通知(无论是否出现异常,都会调用)
//	public void after() {
//		System.out.println("这是后置通知,无论是否出现异常,都会调用");
//	}
}

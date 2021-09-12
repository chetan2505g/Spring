package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before(value = "execution(* com.aop.service.PaymentService.makePayment() )")
	public void printBefore() {
		System.out.println("payment before");
	}
	
	@After(value = "execution(* com.aop.service.PaymentService.makePayment() )")
	public void printAfter() {
		System.out.println("payment before");
	}
}

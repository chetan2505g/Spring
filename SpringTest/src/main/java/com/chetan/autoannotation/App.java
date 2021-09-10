package com.chetan.autoannotation;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/autoannotation/BeansAutowiring.xml");

		Emp emp = (Emp)  context.getBean("emp");
System.out.println("Employee auwiring: "+ emp.getAddress());
	}
}

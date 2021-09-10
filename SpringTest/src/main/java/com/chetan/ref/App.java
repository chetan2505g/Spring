package com.chetan.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/ref/BeansRef.xml");
		A obj = (A) context.getBean("A");
		
		System.out.println("Employee Object:"+obj.getX());
		System.out.println("Employee Object:"+obj.getOb());
		
		

		System.out.println("Run Successfully ");

	}
}

package com.chetan.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/collection/BeansCollection.xml");
		Emp obj = (Emp) context.getBean("Emp");
		
		System.out.println("Employee Object:"+obj.getName());
		System.out.println("Employee Phone:"+obj.getPhone());
		System.out.println("Employee Add"+obj.getAddresses());
		System.out.println("Employee Course:"+obj.getCourses());
		System.out.println("Employee Course:"+obj.getProps().getProperty("userName"));
		

		System.out.println("Run Successfully ");

	}
}

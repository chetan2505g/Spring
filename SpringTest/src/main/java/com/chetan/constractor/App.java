package com.chetan.constractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/constractor/BeansCI.xml");
		Person obj = (Person) context.getBean("person");
		
		System.out.println("Employee Object:"+obj);
		
		
		

		System.out.println("Run Successfully ");

	}
}

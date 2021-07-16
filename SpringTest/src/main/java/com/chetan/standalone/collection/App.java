package com.chetan.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/standalone/collection/BeansSTCollection.xml");
		Person obj = (Person) context.getBean("person");
		
		System.out.println("Employee Object:"+obj.getFriends());
		System.out.println("Employee Database detail:"+obj.getDbdetail());
		

		System.out.println("Run Successfully ");

	}
}

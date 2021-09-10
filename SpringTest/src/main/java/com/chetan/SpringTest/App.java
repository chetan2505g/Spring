package com.chetan.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld1");
		System.out.println("Object1:"+obj.getMsg());
		System.out.println("Object2:"+obj1);

		System.out.println("Run Successfully ");

	}
}

package com.chetan.lifecycle;

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
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/lifecycle/BeansLC.xml");
		context.registerShutdownHook();
		
//		Somosa obj = (Somosa) context.getBean("somosa");
//		System.out.println("Employee Object:" + obj);
//		
//		System.out.println("******* Pepsi **********");
//		Pepsi pepsi =(Pepsi) context.getBean("pepsi");
//		System.out.println("Pepsi: " +pepsi);
		
		System.out.println("******* Example **********");
		Example exam=(Example) context.getBean("example");
		System.out.println("Example : " + exam);
		System.out.println("Run succesfully");
		
	}
}

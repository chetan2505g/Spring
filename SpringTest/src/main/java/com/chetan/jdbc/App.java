package com.chetan.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/jdbc/BeansJdbc.xml");
		JdbcTemplate jdbc= (JdbcTemplate) context.getBean("JdbcTemplate");
		//Student obj = new Student(2,"Chetan","Mum");
		
		String query = "Insert into test.Student  values(?,?,?)";
		int n =jdbc.update(query,1,"Chetan","Mum");
		System.out.println("Output:" +n);
		
	}

}

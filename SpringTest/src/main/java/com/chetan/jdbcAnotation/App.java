package com.chetan.jdbcAnotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao jdbc = (StudentDaoImp) context.getBean("studentDao");

		//Student obj = new Student(3, "Raju", "Mum");

		//int n = jdbc.save(obj);
		//System.out.println("Output:" + n);

		List<Student> ls = (List<Student>) jdbc.select();
		System.out.println("Records" + ls);

		for (Student ls1 : ls) {
			System.out.print(ls1.getId() + " ");
			System.out.println(ls1.getName());
		}
	}
}

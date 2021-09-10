package com.chetan.jdbcDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chetan/jdbcDao/BeansJdbcDao.xml");
		StudentDao jdbc = (StudentDaoImp) context.getBean("studentDao");
		Student obj = new Student(2, "Chetan", "Mum");
		int n = jdbc.save(obj);
		System.out.println("Output:" + n);

	}

}

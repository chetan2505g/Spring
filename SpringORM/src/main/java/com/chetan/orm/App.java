package com.chetan.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chetan.orm.dao.StudentDao;
import com.chetan.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("configOrm.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Enter option");
			System.out.println("1 for insert student");
			System.out.println("2 for read student");
			System.out.println("3 for read Single student");
			System.out.println("6 for exit");
			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1: // Insert single record

					Student st = new Student();
					System.out.println("Enter ID");
					int id = Integer.parseInt(br.readLine());

					System.out.println("Enter Name");
					String name = br.readLine();

					System.out.println("Enter City");
					String city = br.readLine();

					st.setsName(name);
					st.setStudentId(id);
					st.setsCity(city);

					studentDao.save(st);
					System.out.println("Thanks for adding");

					break;
				case 2: // Read all student
					System.out.println("pressed 2");
					List<Student> studentList = studentDao.getAllStudent();
					System.out.println("Student Object" + studentList);
					System.out.println("Success fully execute");
					break;
				case 3: // Read single student
						System.out.println("Enter id");
					Student studentObj = studentDao.getStudent(Integer.parseInt(br.readLine()));
					System.out.println("Student Object" + studentObj);
					System.out.println("Success fully execute");
					break;
				case 6: // exit
					System.out.println("Thanks for visinting");
					System.exit(0);
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("invalid input");
			}
		}

	}
}

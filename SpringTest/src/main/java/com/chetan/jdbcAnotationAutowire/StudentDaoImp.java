package com.chetan.jdbcAnotationAutowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImp implements StudentDao {
	@Autowired
	JdbcTemplate jdbcT;

	public JdbcTemplate getJdbcT() {
		return jdbcT;
	}

	public void setJdbcT(JdbcTemplate jdbcT) {
		this.jdbcT = jdbcT;
	}

	public int save(Student std) {
		// TODO Auto-generated method stub
		String query = "Insert into test.Student  values(?,?,?)";
		int n = this.jdbcT.update(query, std.getId(), std.getName(), std.getCity());
		return n;
	}

	public List<Student> select() {
		String query = "select * from test.Student";
		return this.jdbcT.query(query, new BeanPropertyRowMapper<Student>(Student.class));

	}

	

}

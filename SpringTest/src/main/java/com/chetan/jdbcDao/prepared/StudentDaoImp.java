package com.chetan.jdbcDao.prepared;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDaoImp implements StudentDao {
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

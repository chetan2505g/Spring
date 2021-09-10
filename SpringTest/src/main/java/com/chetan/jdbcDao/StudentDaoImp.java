package com.chetan.jdbcDao;

import org.springframework.jdbc.core.JdbcTemplate;

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

}

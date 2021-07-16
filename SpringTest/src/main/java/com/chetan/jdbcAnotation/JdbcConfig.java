package com.chetan.jdbcAnotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/springTest");
		ds.setUsername("postgres");
		ds.setPassword("postgres");
		return ds;
	}

	@Bean("jdbcTeamplet")
	public JdbcTemplate getJadbcTeamplat() {
		JdbcTemplate jdbcT = new JdbcTemplate();
		jdbcT.setDataSource(getDataSource());
		return jdbcT;

	}

	@Bean("studentDao")
	public StudentDaoImp getStudentDaoImp() {
		StudentDaoImp std = new StudentDaoImp();
		std.setJdbcT(getJadbcTeamplat());
		return std;

	}
}

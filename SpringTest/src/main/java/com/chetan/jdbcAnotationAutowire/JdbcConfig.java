package com.chetan.jdbcAnotationAutowire;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.chetan.jdbcAnotationAutowire"})
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

	
}

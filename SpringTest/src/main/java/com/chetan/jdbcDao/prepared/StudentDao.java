package com.chetan.jdbcDao.prepared;

import java.util.List;

public interface StudentDao {
	public int save(Student stu);
	public List<Student> select();
}

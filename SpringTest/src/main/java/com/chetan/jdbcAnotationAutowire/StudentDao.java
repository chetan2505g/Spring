package com.chetan.jdbcAnotationAutowire;

import java.util.List;

public interface StudentDao {
	public int save(Student stu);
	public List<Student> select();
}

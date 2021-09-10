package com.chetan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Service;

import com.chetan.dao.UserClass;
import com.chetan.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public int createUser(UserClass userClass) {
		 int id = (Integer) this.userDao.saveUser(userClass);
		 return id;
	}
}

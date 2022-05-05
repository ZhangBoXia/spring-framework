package com.zbx.spring.study.demo.service;

import com.zbx.spring.study.demo.bean.User;
import com.zbx.spring.study.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author zhangboxia
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(String name, String password) {
		User user = userDao.get(name);
		if(user != null){
			return Objects.equals(password, user.getPassword());
		}
		return false;
	}

	@Override
	public boolean createUser(String name, String password) {
		return userDao.createUser(name, password) != null;
	}

	@Override
	public User get(String name) {
		return userDao.get(name);
	}
}

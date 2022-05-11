package com.zbx.spring.study.demo.service;

import com.zbx.spring.study.demo.bean.User;

/**
 * @author zhangboxia
 */
public interface UserService {

	boolean login(String name, String password);

	boolean createUser(String name, String password);

	User get(String name);
}

package com.zbx.spring.study.demo.dao;

import com.zbx.spring.study.demo.bean.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangboxia
 */
@Component
public class UserDao {

	private Map<String, User> userCache;

	@PostConstruct
	public void init(){
		userCache = new ConcurrentHashMap<>(16);
		createUser("zbx", "zhangboxia");
		createUser("lxz", "liu");
	}

	public User get(String name){
		return userCache.get(name);
	}

	public User createUser(String name, String password){
		User user = new User(name, password);
		return userCache.put(name, user);
	}
}

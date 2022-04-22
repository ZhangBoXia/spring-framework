package com.zbx.spring.study;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.SimpleAliasRegistry;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class Hello  {

	@Resource
	private World world;

//	@Value("${hello.blessing}") // TODO: 没有生效，不知道原因
	private String blessing;

	private List<String> list;

	// TODO：什么时候执行
	@PostConstruct
	private void init(){
		list = new ArrayList<>();
		list.add("zhangboxia");
		list.add("liuxiaozhu");
	}

	public void hello(){
		for(String name:list){
			System.out.println("Hello, " + name + ", " + blessing);
		}

	}
}

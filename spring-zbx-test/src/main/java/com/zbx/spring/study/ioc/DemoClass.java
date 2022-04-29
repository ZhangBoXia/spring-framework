package com.zbx.spring.study.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DemoClass {

	@Value("${ioc.demo.param}")
	private String param;

	@PostConstruct
	public void init() {
		System.out.println("demoClass init......");
	}

	public DemoClass() {
		System.out.println("demoClass constructor.....");
	}

	public void test() {
		System.out.println("demoClass test, param:" + param);
	}
}

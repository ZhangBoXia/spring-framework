package com.zbx.spring.study;

import com.zbx.spring.study.ioc.DemoClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ZbxConfig.class);

		DemoClass bean = applicationContext.getBean(DemoClass.class);
		bean.test();
	}
}

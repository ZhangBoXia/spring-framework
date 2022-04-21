package com.zbx.spring.study;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ZbxConfig.class);

		Hello bean = applicationContext.getBean(Hello.class);
		bean.hello();
		applicationContext.getBean(World.class);
	}
}

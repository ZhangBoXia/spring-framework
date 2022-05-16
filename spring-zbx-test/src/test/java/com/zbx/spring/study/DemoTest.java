package com.zbx.spring.study;

import com.zbx.spring.study.aop.HitAspect;
import com.zbx.spring.study.demo.service.UserService;
import com.zbx.spring.study.ioc.DemoClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class DemoTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(ZbxConfig.class);
		applicationContext.start();
		DemoClass bean = applicationContext.getBean(DemoClass.class);
		bean.test();
	}

	@Test
	public void testAop() {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(ZbxConfig.class);
		UserService bean = applicationContext.getBean(UserService.class);
		bean.createUser("老A", "aaa");
		bean.login("老A", "aaa");
		HitAspect h = applicationContext.getBean(HitAspect.class);
		System.out.println(h.getI());
	}


	/**
	 * 测试一个线程的创建耗时
	 */
	@Test
	public void test_ThreadTimeOut(){
		long start = System.currentTimeMillis();
		for(int i=0; i<1000; i++){
			Thread t = new Thread();
		}
		long end = System.currentTimeMillis();
		long sum = end - start;
		System.out.println("创建1000个线程耗时："+ sum + "ms, 每个线程耗时："+sum/1000);
	}
}

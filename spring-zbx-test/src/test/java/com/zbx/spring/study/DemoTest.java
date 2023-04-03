package com.zbx.spring.study;

import com.zbx.spring.study.aop.HitAspect;
import com.zbx.spring.study.demo.DemoConfig;
import com.zbx.spring.study.demo.service.UserService;
import com.zbx.spring.study.ioc.DemoClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.MethodMetadata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					System.out.println("开始睡眠 。。。");
					Thread.sleep(10000);
					System.out.println("结束睡眠 。。。");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
		System.out.println("主线程开始睡眠 。。。");
		Thread.sleep(5000);
		System.out.println("主线程结束睡眠 。。。");
	}

	@Test
	public void testAop() {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(ZbxConfig.class);
		UserService bean = applicationContext.getBean(UserService.class);
		bean.createUser("老A", "aaa");
		bean.login("老A", "aaa");
		HitAspect h = applicationContext.getBean(HitAspect.class);
		AnnotatedGenericBeanDefinition zbxConfig = (AnnotatedGenericBeanDefinition)applicationContext.getBeanDefinition("zbxConfig");
		Set<MethodMetadata> bean1 = zbxConfig.getMetadata().getAnnotatedMethods("bean");
		String[] strings = zbxConfig.attributeNames();
		System.out.println(h.getI());
	}

	@Test
	public void testConfig(){
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
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

	@Test
	/**
	 * 1、new ScheduledFutureTask方法新建ScheduledFutureTask。
	 * 2、delayedExecute方法
	 * RunnableScheduledFuture ScheduledExecutorService有一个内部类实现了这个接口，
	 * 这个类中保存了目标任务和延迟时间、周期。
	 * 普通线程池中的工作队列存放的是目标任务Runnable，而这里存放的是ScheduledFutureTask，这是实现延迟和周期的关键。
	 *
	 */
	public void test_demo(){
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
		scheduledExecutorService.schedule(new Runnable() {
			@Override
			public void run() {
				System.out.println("十秒后开始");
			}
		}, 10, TimeUnit.SECONDS);
		scheduledExecutorService.schedule(new Runnable() {
			@Override
			public void run() {
				System.out.println("1秒后开始");
			}
		}, 1, TimeUnit.SECONDS);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}

package com.zbx.spring.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhangboxia
 */
@Aspect
@Component
public class SystemArchitecture {

	@Pointcut("execution(* com.zbx.spring.study.demo.service.*.*(..))")
	public void userPointCut(){
	}
}

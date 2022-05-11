package com.zbx.spring.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zhangboxia
 */
@Aspect
@Component
public class HitAspect {

	private int i = 0;

	@Before("com.zbx.spring.study.aop.SystemArchitecture.userPointCut()")
	public void hit(){
		i++;
	}

	public int getI(){
		return i;
	}
}

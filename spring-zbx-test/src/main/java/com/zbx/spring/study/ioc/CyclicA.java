package com.zbx.spring.study.ioc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangboxia
 */
@Service
public class CyclicA {

	@Resource
	private CyclicB cyclicB;
}

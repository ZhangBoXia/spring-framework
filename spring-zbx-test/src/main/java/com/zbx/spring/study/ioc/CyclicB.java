package com.zbx.spring.study.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyclicB {

	@Autowired
	private CyclicA cyclicA;
}

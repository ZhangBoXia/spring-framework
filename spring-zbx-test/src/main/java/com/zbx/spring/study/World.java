package com.zbx.spring.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class World {

	@Autowired
	private Hello hello;
}

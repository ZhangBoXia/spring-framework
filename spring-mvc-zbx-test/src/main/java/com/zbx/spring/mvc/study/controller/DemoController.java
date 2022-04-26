package com.zbx.spring.mvc.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class DemoController {

	@GetMapping("names")
	public String getNames(@RequestParam String name){

		XmlWebApplicationContext xmlWebApplicationContext;
		return name;
	}
}

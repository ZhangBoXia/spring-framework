package com.zbx.spring.mvc.study.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author zhangboxia
 */
@Component
public class Demo1Controller extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,
												 javax.servlet.http.HttpServletResponse response) throws Exception {
		System.out.println("demo1 .......");
		return null;
	}
}

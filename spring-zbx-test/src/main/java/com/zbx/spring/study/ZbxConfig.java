package com.zbx.spring.study;

import com.zbx.spring.study.demo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:application.yml")
@ComponentScan
@EnableAspectJAutoProxy
public class ZbxConfig {

	@Bean
	public User user(){
		return new User("zbx", "zbx");
	}

}

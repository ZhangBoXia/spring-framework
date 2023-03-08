package com.zbx.spring.study.demo;

import com.zbx.spring.study.ZbxConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangboxia
 */
@Configuration
@ComponentScan
//@PropertySource("classpath:application.yml")
@EnableAspectJAutoProxy
public class DemoConfig {

	@Bean
	public ZbxConfig zbxConfig(){
		return new ZbxConfig();
	}
}

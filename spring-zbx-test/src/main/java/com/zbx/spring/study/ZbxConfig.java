package com.zbx.spring.study;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:application.yml")
@ComponentScan
@EnableAspectJAutoProxy
public class ZbxConfig {

}

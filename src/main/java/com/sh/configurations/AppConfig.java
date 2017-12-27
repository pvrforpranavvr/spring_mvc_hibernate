package com.sh.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configurable
@EnableWebMvc
@ComponentScan(basePackages = "com.sh")
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Autowired
	Environment env;
	
	

}

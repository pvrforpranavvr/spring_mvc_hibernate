package com.springmvc_hibernate.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configurable
@EnableWebMvc
@ComponentScan(basePackages = "com.springmvc_hibernate")
public class AppConfig {

}

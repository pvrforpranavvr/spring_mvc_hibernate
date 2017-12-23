package com.sh.configurations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(AppConfig.class);
		webContext.setServletContext(servletContext);

		ServletRegistration.Dynamic servletReg = servletContext.addServlet("dispatcher",
				new DispatcherServlet(webContext));
		servletReg.setLoadOnStartup(1);
		servletReg.addMapping("/");
	}

}

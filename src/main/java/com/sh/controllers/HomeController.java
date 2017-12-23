package com.sh.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	Logger logger = Logger.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String name() {
		System.out.println("???");
		logger.info("hai");
		return "{\"name\":\"pvr\"}";
	}
}

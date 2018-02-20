package com.sh.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sh.models.User;
import com.sh.services.UserService;

@RestController
public class HomeController {
	Logger logger = Logger.getLogger(HomeController.class);
	//
	@Autowired
	@Qualifier("userService")
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String name() {
//		User user = new User();
//		user.setId(1l);
//		user.setName("pvr");
//		user.setGender("male");
//		// System.out.println(userService);
//		userService.create(user);
		return "{\"name\":\"pvr\"}";
	}

}

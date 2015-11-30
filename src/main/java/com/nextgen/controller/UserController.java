package com.nextgen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	//@ResponseBody
	@RequestMapping("/greet")
	public String greetUser() {
		return "hello";
	}
	
}

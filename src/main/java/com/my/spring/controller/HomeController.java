package com.my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("i am in welcome homecontroller");
		return "index";
	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String getHome(ModelMap model) {
	
		
		return "home";
	}

}

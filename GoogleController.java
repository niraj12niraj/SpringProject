package com.my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoogleController {

	@RequestMapping(value="/imageSearch", method=RequestMethod.PUT)
	public String imageSearch() {
		
		return "imageSearch";
	}
}

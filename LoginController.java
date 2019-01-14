package com.my.spring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import com.my.spring.entity.User;

@Controller
@RequestMapping("loginController")
public class LoginController {

	
	@RequestMapping(value = "/logon", method = RequestMethod.POST)
	public String logon(@ModelAttribute("user") User user, Model model, HttpServletRequest req,Principal principal) throws IOException, Exception {
		User u = new User();
				System.out.println("1--email--" + req.getParameter("email"));
		System.out.println("1--password--" + req.getParameter("pass"));
		System.out.println("1--password--" + req.getParameter("pass"));
		System.out.println("i am in save on LoginController");
		if (u.getEmail() == req.getParameter("email")) {
			System.out.println("1--email--" + req.getParameter("email"));
			System.out.println("1--password--" + req.getParameter("pass"));
			if (u.getPassword() == req.getParameter("pass")) {
			
				System.out.println("email--" + req.getParameter("email"));
				System.out.println("password--" + req.getParameter("pass"));
				return "userHome";
			}
		}
		return "error";
	}

}

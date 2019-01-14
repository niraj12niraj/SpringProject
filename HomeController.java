package com.my.spring.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.entity.User;
import com.my.spring.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("i am in welcome homecontroller");
		return "home";
	}

	@RequestMapping(value = "/registration")
	public String registration() {
		System.out.println("i am in registration homecontroller");
		return "save";
	}

	@RequestMapping(value = "/login")
	public String login() {
		System.out.println("i am in registration homecontroller");
		return "login";
	}
	@RequestMapping(value="/fblogin")
	public String loginByFaceBook() {
		System.out.println("on fbHome");
		return "facebook";
	}

	@RequestMapping(value = { "/records" }, method = RequestMethod.GET)
	public String userList(User user,ModelMap  model) {
		
		System.out.println("i am in userList homecontroller");
		try {
			List<User> list = userService.getList();
			// Stream<User> s=li.parallelStream().filter(p->p.getId()!=null);
			// s.forEach(System.out::println);
			// by while --
			System.out.println("inside while---");
			Iterator<User> it = list.iterator();
			while (it.hasNext()) {
				user = it.next();
				System.out.println("Id--" + user.getId() + ", Name--" + user.getName() + ", Mobile--" + user.getName()
						+ "Role--" + user.getRole() + ", Address--" + user.getAddress() + ", Email--" + user.getEmail()
						+ ", Password--" + "*****");
			}
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "displayUserList";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("user") User user) throws IOException, Exception {
		System.out.println("i am in save on HomeController");

		/*-----inserted details--*/
		System.out.println("id--" + user.getId());
		System.out.println("name--" + user.getName());
		System.out.println("address--" + user.getAddress());
		System.out.println("mobile--" + user.getMobile());
		System.out.println("role--" + user.getRole());
		System.out.println("email--" + user.getEmail());
		System.out.println("password--" + user.getPassword());
		/*
		 * model.addAttribute("id", user.getId());
		 * model.addAttribute("name",user.getName()); model.addAttribute("address",
		 * user.getAddress()); model.addAttribute("mobile", user.getMobile());
		 * model.addAttribute("role", user.getRole()); model.addAttribute("email",
		 * user.getEmail()); model.addAttribute("password", user.getPassword());
		 */

		userService.saveUser(user);

		return new ModelAndView("success", "user", user);
	}
	@RequestMapping("/update")
	public String goForUpdate() {
		
		return "update";
	}
	

	@RequestMapping(value = "/editOrUpdate{id}", method = RequestMethod.GET)
	public @ResponseBody User editOrUpdate(@PathVariable("id") Long id,@RequestBody User user) {
		user=userService.getUserById(id);
		System.out.println(user.getId()+"--"+id);
		if(user.getId()!=null) {
		user.setName("name");
		user.setMobile(user.getMobile());
		user.setEmail("email");
		user.setRole("role");
		user.setAddress("address");
		user.setPassword("password");
		}
		return user;
	}

	@RequestMapping(value = "/search")
	public String search() {
		return "searchUser";
	}
	

	@RequestMapping(value = "/searchUserById", method = RequestMethod.POST)
	public String searchUserById(@ModelAttribute("user") User user, ModelMap model) {
		User u = new User();
		Long id = user.getId();
		if (id != null) {
			u = userService.getUserById(user.getId());
		}
		System.out.println("User Id--" + u.getId() + ", UserName--" + u.getName() + ", UserNumber--" + u.getMobile()
				+ ", UserRole--" + u.getRole() + ", UserEmail--" + u.getEmail() + ", UserPassword--*******"
				+ ", UserAddress--" + u.getAddress());
		model.addAttribute("user", u);
		return "searchUser";
	}
	
	@RequestMapping(value = "/searchUserByName", method = RequestMethod.POST)
	public String searchUserByName(@ModelAttribute("user") User user, ModelMap model) {
		User u = new User();
		String name = user.getName();
		if (name != null) {
			u = userService.getUserByName(name);
		}
		System.out.println("User Id--" + u.getId() + ", UserName--" + u.getName() + ", UserNumber--" + u.getMobile()
				+ ", UserRole--" + u.getRole() + ", UserEmail--" + u.getEmail() + ", UserPassword--*******"
				+ ", UserAddress--" + u.getAddress());
		return "searchUser";
	}
	@RequestMapping(value = "/searchUserByNumber", method = RequestMethod.POST)
	public String searchUserByNumber(@ModelAttribute("user") User user, ModelMap model) {
		User u = new User();
		Long mobile = user.getMobile();
		if (mobile != null) {
			u = userService.getUserByMobileNumber(mobile);
		}
		System.out.println("User Id--" + u.getId() + ", UserName--" + u.getName() + ", UserNumber--" + u.getMobile()
				+ ", UserRole--" + u.getRole() + ", UserEmail--" + u.getEmail() + ", UserPassword--*******"
				+ ", UserAddress--" + u.getAddress());
		return "searchUser";
	}
	@RequestMapping(value = "/searchUserByEmail", method = RequestMethod.POST)
	public String searchUserByEmail(@ModelAttribute("user") User user, ModelMap model) {
		User u = new User();
		String email = user.getEmail();
		if (email != null) {
			u = userService.getUserByEmail(email);
		}
		System.out.println("User Id--" + u.getId() + ", UserName--" + u.getName() + ", UserNumber--" + u.getMobile()
				+ ", UserRole--" + u.getRole() + ", UserEmail--" + u.getEmail() + ", UserPassword--*******"
				+ ", UserAddress--" + u.getAddress());
		return "searchUser";
	}
	

}

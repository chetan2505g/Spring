package com.chetan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chetan.dao.UserClass;
import com.chetan.service.UserService;

@Controller
public class UserManagmentController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void common(Model m)
	{
		m.addAttribute("Title","Model attribute on functional level");
	}
	
	@RequestMapping("/Login")
	public String login() {
		System.out.println("Login");
		return "Login";
	}

	@RequestMapping("/Registration")
	public String userRegistration() {
		System.out.println("UserRegistration");
		return "UserRegistration";
	}
	/* Old style to handle requext */
	@RequestMapping(path = "/loginform", method = RequestMethod.POST)
	public String loginFormhandler(HttpServletRequest request) {
		System.out.println(request.getParameter("email"));
		return "Success";
	}

	/* Handle request by annotation */
	@RequestMapping(path = "/loginformAnnotation", method = RequestMethod.POST)
	public String loginFormhandlerAnnotation(@RequestParam("email") String userEmail,
			@RequestParam(required = true, name = "pwd") String epwd, Model model) {

		System.out.println(userEmail);
		System.out.println(epwd);

		model.addAttribute("userEmail", userEmail);
		model.addAttribute("pwd", epwd);

		return "Success";
	}
	
	/* Handle request by annotation */
	@RequestMapping(path = "/Modelcontroler", method = RequestMethod.POST)
	public String Modelcontroler(@ModelAttribute User user, Model model) {
		return "Success1";
	}
	
	@RequestMapping(path = "/SaveUser", method = RequestMethod.POST)
	public String SaveUser(@ModelAttribute UserClass userClass, Model model) {
		System.out.println(userClass);
		this.userService.createUser(userClass);
		return "Success1";
	}
}

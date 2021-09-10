package com.chetan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/interceptor")
	public String welcome(@RequestParam("username") String username,Model model) {
		System.out.println("Username: " + username);
		return "Success1";
	}
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		/*int str=1/0;
		System.out.println(str);*/
		
		model.addAttribute("name", "Chetan Ghangrekar");
		/* Sending List */
		List<String> frnd = new ArrayList<String>();
		frnd.add("Ajay");
		frnd.add("Raju");
		model.addAttribute("f", frnd);
		
		
		return "index";
	}
	
	/*@ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	@ExceptionHandler(Exception.class)
	public String exceptionHandller(Model m) {
		//m.addAttribute("msg", "<h1> <center>Null pointer exception </center><h1>");
		return "errorpage";
	}*/
	@RequestMapping("/home/{userid}/{username}")
	public String home(@PathVariable("userid") int userid, @PathVariable("username") String username, Model model) {
		System.out.println("user id: " + userid);
		System.out.println("user name: " + username);
		return "index";
	}

	@RequestMapping("/JstlPage")
	public ModelAndView jstlPage() {
		ModelAndView modelandview = new ModelAndView();

		modelandview.addObject("name", "Chetan");

		List<String> frnd = new ArrayList<String>();
		frnd.add("Ajay");
		frnd.add("Raju");
		modelandview.addObject("f", frnd);

		modelandview.setViewName("JstlPage");
		return modelandview;
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelandview = new ModelAndView();

		modelandview.addObject("Name", "Chetan");
		modelandview.setViewName("help");
		return modelandview;
	}

}

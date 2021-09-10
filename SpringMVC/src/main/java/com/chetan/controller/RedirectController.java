package com.chetan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("One");
		return "redirect:/enjoy";
	}

	@RequestMapping("/two")
	public RedirectView two() {
		System.out.println("two");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}

	@RequestMapping("/enjoy")
	public String enjoy() {
		System.out.println("enjoy");
		return "UserRegistration";
	}
	
	@RequestMapping(path = "/handleform")
	public String formHandler(@ModelAttribute("studen") Student student,BindingResult result ) {
		System.out.println("handleform");
		
		if (result.hasErrors()) {
			return "complex_form";
		}
		return "UserRegistration";
	}
}

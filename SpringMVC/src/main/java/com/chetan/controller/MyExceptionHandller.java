package com.chetan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandller {

	@ExceptionHandler(NullPointerException.class)
	public String nullPonterexception(Model m) {
		m.addAttribute("msg", "<h1> <center>Null pointer exception </center><h1>");
		return "errorpage";
	}
	@ResponseStatus(value=HttpStatus.CREATED)
	@ExceptionHandler(Exception.class)
	public String exceptionHandller(Model m) {
		m.addAttribute("msg", "<h1> <center>common exception class</center><h1>");
		return "errorpage";
	}
}

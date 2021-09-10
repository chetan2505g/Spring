package com.chetan.myclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class myInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("Pre handler fire");
		String u = request.getParameter("username");
		if (u.startsWith("D")) {
			response.setContentType("text/html");
			response.getWriter().println("Name is start from D");
			return false;
		}
		return true;
	}
}

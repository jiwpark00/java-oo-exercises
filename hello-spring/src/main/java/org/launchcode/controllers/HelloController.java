package org.launchcode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(HttpServletRequest request) {
		
		// get name parameter from request; will be null when no parameter is passed
		// so let's fix that 
		String name = request.getParameter("name");
		
		if (name == null) {
			name = "world";
		}
		
		return "<h1>" + HelloMessage.getMessage(name) + "</h1>";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public String login(HttpServletRequest request) {
		// this is to get the request
		
		String username = request.getParameter("username");
		
		if (username == null) {
			username = "fake user!!";
			return "<h1> Alert the system, it is " + username;
		}
		
		return "<h1> Welcome " + username + " and thanks for logging in today!";
	}
	
}

package org.launchcode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.models.HelloLog;
import org.launchcode.models.HelloMessage;
import org.launchcode.models.dao.HelloLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
	
	@Autowired
	private HelloLogDao helloLogDao;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloForm() {
		return "helloform";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	//@ResponseBody Now getting rid of this because that's what allowed to just print a string
	public String hello(HttpServletRequest request, Model model) {
		
		// get name parameter from request; will be null when no parameter is passed
		// so let's fix that 
		
		String name = request.getParameter("name");
		
		if (name == null || name == "") {
			name = "world";
		}
		
		HelloLog log = new HelloLog(name);
		helloLogDao.save(log);
		
		model.addAttribute("message",HelloMessage.getMessage(name));
		model.addAttribute("title", "Hello, Spring! Resonse");
		return "hello";
	}
	
	@RequestMapping(value = "/log")
	public String log(Model model) {
		// get data out of db
		List<HelloLog> logs = helloLogDao.findAll();
		// put data into template
		model.addAttribute("logs", logs);
		return "log";
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

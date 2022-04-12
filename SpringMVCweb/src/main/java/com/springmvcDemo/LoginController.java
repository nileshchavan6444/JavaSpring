package com.springmvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcome(@RequestParam String username, @RequestParam String password,ModelMap modelmap)
	{
		
		modelmap.put("name", username);
		modelmap.put("pass", password);
		System.out.println("username = " + username + "  Password ==  "+ password );
		return "welcome";
	}
}

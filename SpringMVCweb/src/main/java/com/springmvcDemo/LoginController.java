package com.springmvcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvcDemo.service.ValidateUser;

@Controller
public class LoginController {

	@Autowired
	ValidateUser obj;
	
	
	@GetMapping("/login")
	public String showLoginPage()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String welcome(@RequestParam String username, @RequestParam String password,ModelMap modelmap)
	{
		
		boolean isUserValid = obj.isUserValid(username, password);
		if(!isUserValid)
		{
			modelmap.put("errormessage", "Invalid Username or Password");
			return "login";
		}
		 
		modelmap.put("name", username);
		modelmap.put("pass", password);
		return "welcome";
	}
}

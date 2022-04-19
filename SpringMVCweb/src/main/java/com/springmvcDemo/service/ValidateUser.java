package com.springmvcDemo.service;

import org.springframework.stereotype.Service;

@Service
public class ValidateUser {
	
	public boolean isUserValid(String username,String password)
	{
		return 
				username.equalsIgnoreCase("nilesh") && password.equals("dummy");
	}

}

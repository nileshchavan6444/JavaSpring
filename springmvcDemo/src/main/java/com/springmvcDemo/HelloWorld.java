package com.springmvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	HelloWorld()
	{
		System.out.println("In Hello World Constructor");
	}

	@RequestMapping(value ="/hello")
	@ResponseBody
	public String hello()
	{
		return "hello.jsp";
	}
	
	@RequestMapping(value="/world")
	public void world()
	{
		System.out.println("World");
	}
	
	@RequestMapping("/hi")
	public void test()
	{
		System.out.println("Welcome to First Project");
	}
	
}

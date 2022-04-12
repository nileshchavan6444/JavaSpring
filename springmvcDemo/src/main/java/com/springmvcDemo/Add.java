package com.springmvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Add {
	
	@RequestMapping("/add")
	public String  add(@RequestParam int text1,@RequestParam("text2") int b,ModelMap model)
	
	{
		model.put("text1", text1);
		return "hello.jsp";
	}

}

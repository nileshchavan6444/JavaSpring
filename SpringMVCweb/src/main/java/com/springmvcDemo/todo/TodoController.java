package com.springmvcDemo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

	@Autowired
	TodoService service;
	
	@GetMapping("/todos")
	public void getAllTodos()
	{
		System.out.println(service.retrieveTodos());
	}
}

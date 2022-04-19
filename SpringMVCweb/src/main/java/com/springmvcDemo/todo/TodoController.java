package com.springmvcDemo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

	@Autowired
	TodoService service;
	
	@GetMapping("/todos")
	public String getAllTodos(ModelMap model)
	{
		List<Todo> listOfTodos = service.retrieveTodos();
		model.addAttribute("todos",listOfTodos);
		return "list-todos";
		
	}
}

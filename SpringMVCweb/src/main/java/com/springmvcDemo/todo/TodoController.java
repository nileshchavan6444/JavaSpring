package com.springmvcDemo.todo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/todo/{user}")
	public String getTodosBasedOnUser(@PathVariable String user,ModelMap model)
	{
		List<Todo> listOfTodos = service.retrieveTodosBasedOnUsername(user);
		model.addAttribute("todos",listOfTodos);
		return "list-todos";
	}
	
	@GetMapping("/addtodo")
	public String addTodos(ModelMap model)
	{
		service.addTodos("Sunanda", "Learn Spring MVC", new Date(), false);
	
		List<Todo> listOfTodos = service.retrieveTodos();
		model.addAttribute("todos",listOfTodos);	
		return "list-todos";
	}
	
	
}

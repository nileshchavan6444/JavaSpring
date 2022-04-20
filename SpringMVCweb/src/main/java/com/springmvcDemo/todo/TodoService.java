package com.springmvcDemo.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "nilesh", "Learn spring mvc", new Date(), false));
		todos.add(new Todo(2, "nilesh", "learn core java", new Date(), false));
		todos.add(new Todo(3, "John", "learn Hibernate", new Date(), false));

	}

	
	public List<Todo> retrieveTodos() {
		return todos;
	}

	
	public List<Todo> retrieveTodosBasedOnUsername(String name) {
		
		List<Todo> filteredTodo = new ArrayList<Todo>();

		for (Todo todo : todos) {
			if (todo.getUser().equalsIgnoreCase(name))
				filteredTodo.add(todo);
		}
		return filteredTodo;

	}
	
	public void addTodos(String user,String desc,Date targetDate,boolean isDone)
	{
		todos.add(new Todo(++todoCount, user, desc, targetDate, isDone));
	}
}

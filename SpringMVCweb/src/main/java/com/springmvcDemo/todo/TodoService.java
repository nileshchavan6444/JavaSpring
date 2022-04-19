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
		todos.add(new Todo(3, "nilesh", "learn Hibernate", new Date(), false));

	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
}

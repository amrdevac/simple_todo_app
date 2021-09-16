package com.amr.app.todo.app.todo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TodoServiceInterface {

    Page<Todo> getAllTodo(Pageable pageable);

    Todo saveNewTodoData(Todo request);

    Todo saveUpdatedTodoDataById(Integer kd_todo, Todo request);

    Todo deleteTodoDataById(Integer kd_toodo);

    void todoRequestValidation(Todo todo);
}

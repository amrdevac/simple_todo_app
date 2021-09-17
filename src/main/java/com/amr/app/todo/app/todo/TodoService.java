package com.amr.app.todo.app.todo;

import com.amr.app.todo.app.Controller;
import com.amr.app.todo.config.exception.dataNotFoundException.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Transactional
@Service
public class TodoService extends Controller implements TodoServiceInterface {

    private final TodoRepository todoRepository;

    @Override
    public Page<Todo> getAllTodo(Pageable pageable) {
        return todoRepository.findAll(pageable);
    }

    @Override
    public Todo saveNewTodoData(Todo request) {
        todoRequestValidation(request);
        request.setKd_todo(create_random_number(101));
        return todoRepository.save(request);
    }

    @Override
    public Todo saveUpdatedTodoDataById(Integer kd_todo, Todo request) {
        todoRequestValidation(request);
        todoRepository.findById(kd_todo).orElseThrow(() -> new DataNotFoundException());
        request.setKd_todo(kd_todo);
        return todoRepository.save(request);
    }

    @Override
    public Todo deleteTodoDataById(Integer kd_toodo) {
        Todo todo = todoRepository.findById(kd_toodo).orElseThrow(() ->
                new DataNotFoundException()
        );
        todoRepository.deleteById(kd_toodo);
        return todo;
    }

    @Override
    public void todoRequestValidation(Todo todo) {
        Map request = new HashMap();
        request.put("todo_name", todo.getTodo_name());
        request.put("status", todo.getTodo_status());
        request.put("todo_order", todo.getTodo_order());

        globalValidationFormInput(request);
    }
}

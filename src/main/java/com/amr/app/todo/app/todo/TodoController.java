package com.amr.app.todo.app.todo;

import com.amr.app.todo.app.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@Transactional
@RequestMapping("/api/todo")
public class TodoController extends Controller {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<Page<Todo>> index(Pageable pageable) {
        return ResponseEntity.ok().body(todoService.getAllTodo(pageable));
    }

    @PostMapping
    public ResponseEntity<Map> store(@RequestBody Todo request) {
        return ResponseEntity.ok().body(customResponse("Created Successfuly", 200, todoService.saveNewTodoData(request)));
    }

    @PutMapping("{kd_todo}")
    public ResponseEntity<Map> store(@PathVariable Integer kd_todo,@RequestBody Todo request) {
        return ResponseEntity.ok().body(customResponse("Updated Successfuly", 200, todoService. saveUpdatedTodoDataById(kd_todo, request)));
    }

    @DeleteMapping("{kd_todo}")
    public ResponseEntity<Map> destroy(@PathVariable Integer kd_todo) {
        return ResponseEntity.ok().body(customResponse("Deleted Successfuly", 200, todoService.deleteTodoDataById(kd_todo)));
    }


}

package com.amr.app.todo.app.todo;

import com.amr.app.todo.app.todoItem.TodoItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    private Integer kd_todo;


    @Column(length = 35, nullable = false)
    private String todo_name;


    @Column(columnDefinition = "text")
    private String todo_description;


    @Column(nullable = false)
    private Integer todo_order;


    @Column(precision = 1)
    private Boolean todo_status;


}

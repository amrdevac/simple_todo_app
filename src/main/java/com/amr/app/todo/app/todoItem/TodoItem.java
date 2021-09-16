package com.amr.app.todo.app.todoItem;

import com.amr.app.todo.app.todo.Todo;
import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "todo_item")
public class TodoItem {

    @Id
    private Integer kd_todo_item;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_kd_todo", nullable = false)
    private Todo fk_kd_todo;

    @Column(nullable = false, columnDefinition = "", length = 50)
    private String todo_item_name;

    @Column(nullable = false, columnDefinition = "", precision = 0)
    private Boolean todo_item_status;

    @Column(columnDefinition = "text")
    private String todo_item_description;

    @Column(nullable = false)
    private Integer todo_item_order;

}

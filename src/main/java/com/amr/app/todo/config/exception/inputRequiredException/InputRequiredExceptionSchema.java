package com.amr.app.todo.config.exception.inputRequiredException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputRequiredExceptionSchema {
    private Integer status = 422;
    private String field;
    private String message;
    private String exception = "InputRequiredExceptionSchema";

    public InputRequiredExceptionSchema(String field, String message) {
        this.field = field;
        this.message = message;
    }
}

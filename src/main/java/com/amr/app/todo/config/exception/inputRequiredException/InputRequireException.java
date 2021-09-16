package com.amr.app.todo.config.exception.inputRequiredException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InputRequireException extends RuntimeException {
    private String field;
}

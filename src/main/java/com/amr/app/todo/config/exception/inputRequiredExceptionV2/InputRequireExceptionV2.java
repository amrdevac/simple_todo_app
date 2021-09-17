package com.amr.app.todo.config.exception.inputRequiredExceptionV2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InputRequireExceptionV2 extends RuntimeException {
    private Map field;
}

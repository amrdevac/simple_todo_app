package com.amr.app.todo.config.exception.inputRequiredExceptionV2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputRequiredExceptionSchemaV2 {
    private Integer status = 422;
    private String exception = "InputRequiredExceptionSchema";
    private Map fields;

    public InputRequiredExceptionSchemaV2(Map field) {
        this.fields = field;
    }
}

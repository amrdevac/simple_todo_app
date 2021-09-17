package com.amr.app.todo.config.exception.inputRequiredExceptionV2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InputRequiredExceptionInterceptorV2 extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InputRequireExceptionV2.class)
    public final ResponseEntity<Object> handler(InputRequireExceptionV2 ex) {
        InputRequiredExceptionSchemaV2 inputRequiredExceptionSchemaV2 = new InputRequiredExceptionSchemaV2(
                ex.getField()
        );
        return new ResponseEntity(inputRequiredExceptionSchemaV2, HttpStatus.UNPROCESSABLE_ENTITY);

    }
}

package com.amr.app.todo.config.exception.inputRequiredException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InputRequiredExceptionInterceptor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InputRequireException.class)
    public final ResponseEntity<Object> handler(InputRequireException ex) {
        InputRequiredExceptionSchema inputRequiredExceptionSchema = new InputRequiredExceptionSchema(
                ex.getField(), ex.getField() + " field is can't be empty"
        );
        return new ResponseEntity(inputRequiredExceptionSchema, HttpStatus.UNPROCESSABLE_ENTITY);

    }
}

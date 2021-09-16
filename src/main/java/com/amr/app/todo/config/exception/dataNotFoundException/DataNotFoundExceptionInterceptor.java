package com.amr.app.todo.config.exception.dataNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
public class DataNotFoundExceptionInterceptor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<Object> handler(DataNotFoundException ex) {
        DataNotFoundExceptionSchema schema = new DataNotFoundExceptionSchema();
        return new ResponseEntity(schema, HttpStatus.NOT_FOUND);
    }
}

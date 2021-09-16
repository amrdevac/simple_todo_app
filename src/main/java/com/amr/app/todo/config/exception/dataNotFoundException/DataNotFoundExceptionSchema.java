package com.amr.app.todo.config.exception.dataNotFoundException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataNotFoundExceptionSchema {

    private Integer status = 404;
    private String message = "Data Not Found ";
    private String exception = "DataNotFoundExceptionSchema";


}

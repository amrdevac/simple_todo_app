package com.amr.app.todo.app;

import com.amr.app.todo.config.exception.inputRequiredException.InputRequireException;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Controller {

    //    TOD0 : 101
    public Integer create_random_number(Integer primaryCode) {
        Long getTime = new Timestamp(System.currentTimeMillis()).getTime();
        Random randomNumber = new Random();
        int randNumber = randomNumber.nextInt(100);
        return Integer.parseInt(primaryCode + String.valueOf(randNumber * getTime).substring(0, 7));
    }

    public void globalValidationFormInput(Map required) {
        for (Object key : required.keySet()) {
            required.get(key);
            if (required.get(key) == null) {
                throw new InputRequireException(
                        (String) key
                );
            }
        }
    }

    public Map customResponse(String message, Integer status, Object anyData) {
        Map reeponse = new HashMap();

        reeponse.put("status", status);
        reeponse.put("message", message);
        reeponse.put("data", anyData);

        return reeponse;
    }

}

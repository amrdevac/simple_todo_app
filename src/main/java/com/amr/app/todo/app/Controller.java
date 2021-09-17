package com.amr.app.todo.app;

import com.amr.app.todo.config.exception.inputRequiredException.InputRequireException;
import com.amr.app.todo.config.exception.inputRequiredExceptionV2.InputRequireExceptionV2;

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
        Map getAllNulledValue = new HashMap();
        for (Object key : required.keySet()) {
            required.get(key);
            if (required.get(key) == null) {
                getAllNulledValue.put(key, " this field is can't be empty");
            }
        }
        if (!getAllNulledValue.isEmpty()){
            throw new InputRequireExceptionV2(
                    getAllNulledValue
            );
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

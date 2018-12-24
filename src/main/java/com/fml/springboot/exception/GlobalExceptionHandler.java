package com.fml.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ResponseBody //未用模板引擎，所以这个不能少
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Map defaultErrorHandler(Exception ex) {
        Map map = new HashMap<>();
        map.put("code", 100);
        map.put("msg", ex.getMessage());
        return map;
    }

    @ExceptionHandler(value = CustomerException.class)
    public Map customerErrorHandler(CustomerException ex) {
        Map map = new HashMap<>();
        map.put("code", ex.getErrCode());
        map.put("msg", ex.getErrMsg());
        return map;
    }
}

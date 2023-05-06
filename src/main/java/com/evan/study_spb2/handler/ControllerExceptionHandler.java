package com.evan.study_spb2.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

//springboot 全局异常处理
@RestControllerAdvice // 通知，异常捕获 响应数据为json数据 AOP面向切片的原理
public class ControllerExceptionHandler {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @ExceptionHandler(Exception.class) // 全局所有异常捕获 因为Exception是所有异常的父类
    Object handleException(Exception e, HttpServletRequest request){
        Map<String,Object> result = new LinkedHashMap<>(); //可以顺序提取，hashmap是乱序的，所以用linkedHashMap
        if(e instanceof NoHandlerFoundException){
            //NoHandlerFoundException 404错误
            result.put("code","404");
        }else{
            //500服务内部错误
            result.put("code","500");
        }
        result.put("exception",e.getClass().getSimpleName());
        result.put("msg",e.getMessage());
        logger.error("捕获到web应用抛出异常",e);
        return result;
    }

}

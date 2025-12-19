package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandle(ValidationException.class)
    public Response
     

}
package com.example.demo.example.controller;

import com.example.demo.global.util.ErrorApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SampleExceptionAdvice {
    @ExceptionHandler(ExampleException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorApiResponse handleExampleException(ExampleException ex) {
        return ErrorApiResponse.of(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }
}

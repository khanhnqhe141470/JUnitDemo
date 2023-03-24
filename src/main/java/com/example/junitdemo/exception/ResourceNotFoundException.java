package com.example.junitdemo.exception;

public class ResourceNotFoundException extends RuntimeException{

    private String errorMessage;

    public ResourceNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}

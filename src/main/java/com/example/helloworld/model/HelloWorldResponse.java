package com.example.helloworld.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldResponse {

    private String message;

    public HelloWorldResponse() {
        super();
    }

    public HelloWorldResponse(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldResponse [message=" + message + "]";
    }



}
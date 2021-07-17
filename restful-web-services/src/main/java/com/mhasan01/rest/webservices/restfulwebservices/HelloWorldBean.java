package com.mhasan01.rest.webservices.restfulwebservices;

import lombok.Data;

@Data
public class HelloWorldBean {
    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }
}

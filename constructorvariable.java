package com.bala.one;

import org.springframework.stereotype.Component;

@Component
public class constructorvariable {

    private final String message;

    public constructorvariable(){
        this.message="injected via Constructor";
    }
    public String getMessage(){
        return message;
    }
}

package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apc")
public class constructorcontroller {
    private final constructorvariable example;

    public constructorcontroller(constructorvariable example){
        this.example=example;

    }
    @GetMapping("/constructor")
    public String showmessage(){
        return example.getMessage();
    }
}

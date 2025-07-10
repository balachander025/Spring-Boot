package com.bala.one;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hellocon {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

}

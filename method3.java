package com.bala.two;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/amc")
public class method3 {

    @GetMapping("/time")
    public String get(){
        return "current server time "+ LocalDateTime.now();

    }
}

package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class method5 {
    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        return a+b;
    }

    @GetMapping("/add/{a}/{b}/{c}")
    public int add(@PathVariable int a,@PathVariable int b,@PathVariable int c){
        return a+b+c;
    }
    @GetMapping("/add/double/{a}/{b}")
    public double add(@PathVariable double a,@PathVariable double b){
        return a+b;
    }

}

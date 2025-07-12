package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class method4 {
    @GetMapping("/sum/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        return a+b;
    }

}

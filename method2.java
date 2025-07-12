package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/func1")
public class method2 {
    @GetMapping("/gg/{name}")
    public String greet(@PathVariable String name){
        return "hello" + name + "Welcome";
    }
}

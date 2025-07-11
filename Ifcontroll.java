package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ab")
public class ifcontrol {
    @GetMapping("/check/{num}")
    public String checkpos(@PathVariable int num){
        if(num>0){
            return "The number is positive";
        }
        return "The number is not positive";

    }

}

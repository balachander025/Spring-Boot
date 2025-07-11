package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/if")
public class ifelse {
    @GetMapping("/api/{num}")
    public String checkEvenodd(@PathVariable int num){
        if(num % 2==0){
            return "The number is Even";

        }
        else {
            return "The number is odd";
        }
    }

}

package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ternary")

public class ternaryoperator {
    @GetMapping("/check/{num}")
    public String checkEvenodd(@PathVariable int num){
        return num % 2 == 0 ? "Even":"Odd";

    }


}

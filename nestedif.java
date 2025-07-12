package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bb")
public class nestedif {

    @GetMapping("/cc/{num}")
    public String checkPositiveEven(@PathVariable int num) {
        if (num > 0) {
            if (num % 2 == 0) {
                return "The number is positive and even";
            } else {
                return "The number is positive but odd";
            }
        }
        return "The number is not positive";
    }
}


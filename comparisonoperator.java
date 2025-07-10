package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/api")
    public class Comparisonoperator{

        @GetMapping("/compare/{a}/{b}")
        public String compare(@PathVariable int a, @PathVariable int b) {
            return "a == b: " + (a == b) +
                    "<br>a != b: " + (a != b) +
                    "<br>a > b: " + (a > b) +
                    "<br>a < b: " + (a < b) +
                    "<br>a >= b: " + (a >= b) +
                    "<br>a <= b: " + (a <= b);
        }
    }



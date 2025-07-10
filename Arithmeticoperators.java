package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmetic")
public class operator {

        @GetMapping("/add/{a}/{b}")
        public int add(@PathVariable int a, @PathVariable int b) {
            return a + b;
        }

        @GetMapping("/subtract/{a}/{b}")
        public int subtract(@PathVariable int a, @PathVariable int b) {
            return a - b;
        }

        @GetMapping("/multiply/{a}/{b}")
        public int multiply(@PathVariable int a, @PathVariable int b) {
            return a * b;
        }

        @GetMapping("/divide/{a}/{b}")
        public double divide(@PathVariable int a, @PathVariable int b) {
            return (double) a / b;
        }

        @GetMapping("/modulus/{a}/{b}")
        public int modulus(@PathVariable int a, @PathVariable int b) {
            return a % b;
        }
    }




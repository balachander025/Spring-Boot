package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class assignmentoperator {

    @GetMapping("/assign/{a}/{b}")
    public String assignment(@PathVariable int a, @PathVariable int b) {
        int c = a;
        c += b; // c = c + b
        int d = a;
        d *= b; // d = d * b

        return "c += b: " + c + "<br>d *= b: " + d;


    }
}

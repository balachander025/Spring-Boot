package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class logicaloperator {

    @GetMapping("/logic/{a}/{b}")
    public String logical(@PathVariable boolean a, @PathVariable boolean b) {
        return "a && b: " + (a && b) +
                "<br>a || b: " + (a || b) +
                "<br>!a: " + (!a);


    }
}

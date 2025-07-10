package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ab")
public class Variable {
    private String instanevar = "Variable";
    private static String staticvar = "Static variable";

    @GetMapping("/variable")
    public String showVariables() {
        String local = "Local variable";
        return "Local:" + local + "<br> Instance:" + instanevar + "<br> Static" + staticvar;
    }

}

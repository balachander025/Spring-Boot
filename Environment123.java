package com.bala.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/aac")
public class Environment123 {
    @Value("${APP_ENV:Default}")
    private String environment;

    @GetMapping("/env")
    public String getEnvironment() {
        return "Current Environment" + environment;
    }

    }

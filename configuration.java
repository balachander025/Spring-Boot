package com.bala.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class configuration {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/config")
    public String getconfig() {
        return "App Name:" + appName + "<br> Version" + appVersion;
    }
}

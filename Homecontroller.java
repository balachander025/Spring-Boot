package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/aa")
    public String home(){
        return "Welcome to the public Page";
    }
    @GetMapping("/user")
    public String user(){
        return "Welcome to the User Page!";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Welcome to Admin Page";
    }
}

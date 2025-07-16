package com.bala.Three;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hellocontroller {
    @GetMapping("/get")
    public String home(Model model){
        model.addAttribute("message","Welcome to spring boot");
        model.addAttribute("username","Bala");
        return "File1";
    }

}

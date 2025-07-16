package com.bala.Three;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main1 {
    @GetMapping("/gg")
    public String home(Model model){
        model.addAttribute("message ","Hello thymeleaf");
        return "home";
    }
}

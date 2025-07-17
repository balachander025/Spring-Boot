package com.bala.Four;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class signupcontroller {

    @GetMapping("/sign")
    public String show(Model model){
        model.addAttribute("user",new User());
        return "signup_form";

    }
    @PostMapping("/sign")
    public String submit(@ModelAttribute User user,Model model){
        model.addAttribute("user",user);
        return "signup_success";
    }
}

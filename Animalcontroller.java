package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class Animalcontroller {
    @GetMapping("/dog")
    public String getdogsound(){
        dog d=new dog("Buddy");
        return d.makesound();
    }

}

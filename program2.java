package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aa")
public class contol {
    @GetMapping("hel")
    public String sayhel(){
        return "Bala ";
    }

}

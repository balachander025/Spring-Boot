package com.bala.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aci")
public class lombok123 {
    @GetMapping("/lombok")
  public String show(){
        lombok12 example=new lombok12();
        example.setMessage("Using Lombok");
        return example.getMessage();
 }
}

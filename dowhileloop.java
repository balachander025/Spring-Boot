package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ap")
public class dowhileloop {
    
    @GetMapping("/odd/{n}")
    public List<Integer>  generate(@PathVariable int n){
        List<Integer> oddnumbers= new ArrayList<>();
        int i=1;
        do{
            oddnumbers.add(i);
            i+=2;
        }while (i <= n);
        return oddnumbers;
    }
    
}

package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/for")
public class forloop {

    @GetMapping("/numbers/{n}")
    public List<Integer> generateNumbers(@PathVariable int n ){
        List<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=n;i++){
           numbers.add(i);
        }
        return numbers;
    }

}

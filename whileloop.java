package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/while")
public class whileloop {

    @GetMapping("/even/{n}")
    public List<Integer> generateEvenNumbers(@PathVariable int n) {
        List<Integer> evenNumbers = new ArrayList<>();
        int i = 2;
        while (i<=n) {
            evenNumbers.add(i);
            i += 2;
        }
        return evenNumbers;

    }


}

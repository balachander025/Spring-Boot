package com.bala.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elseif")
public class elseif {

    @GetMapping("/grade/{marks}")
    public String checkGrade(@PathVariable int marks) {
        if (marks >= 90) {
            return "Grade: A";
        } else if (marks >= 80) {
            return "Grade: B";
        } else if (marks >= 70) {
            return "Grade: C";
        } else if (marks >= 60) {
            return "Grade: D";
        } else {
            return "Grade: F";
        }
    }
}

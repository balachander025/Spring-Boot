package com.bala.two;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class personcontroller {
    @GetMapping("/get")
    public String getPerson(){
        Person person=new Person("Bala",23);
        return "Name:" +person.getName() +", Age:" + person.getAge();

    }
    @PostMapping("/update")
    public String updateperson(@RequestParam String name,@RequestParam int age ){
        Person person=new Person("chander",25);
        person.setName(name);
        person.setAge(age);
        return "Updated Name:" + person.getName()+",Updated Age:"+person.getAge();

    }
}

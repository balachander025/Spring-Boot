package com.bala.two;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bb")
public class Bankcontroller {
    Bankaccount account=new Bankaccount(1000);

    @GetMapping("/balance")
    public String getbalance(){
        return "current balance $"+account.getBalance();
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
         account.deposit(amount);

            return "Deposited $" + amount + ".New balance $" + account.getBalance();

    }

        @PostMapping("/withdraw")
                public String withdraw(@RequestParam double amount){
            if (account.withdraw(amount)){
                return "withdraw $" + amount +".New Balance $"+account.getBalance();

            }
            return "Insufficient Balance";
        }
    }


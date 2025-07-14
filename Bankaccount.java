package com.bala.two;

public class Bankaccount {
    private double balance;



    public Bankaccount(double initialbalance){
        if (initialbalance>0){
            this.balance=initialbalance;
        }

    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public boolean withdraw(double amount){
        if (amount>0&& amount<=balance){
            balance-=amount;
            return true;
        }
        return false;
    }


}

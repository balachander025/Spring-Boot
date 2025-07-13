package com.bala.two;

public class dog extends Animal {
    public dog(String name){
        super(name);
    }
    @Override
    public String makesound(){
        return name + "Says : Woof Woof";
    }
}

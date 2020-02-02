package com.chamil.codetest.model.bird;

public class Chicken extends Bird {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        //assumption: its wings are clipped
        System.out.println("I cannot fly");
    }
}

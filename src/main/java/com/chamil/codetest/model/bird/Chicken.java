package com.chamil.codetest.model.bird;

import com.chamil.codetest.model.CannotFly;

public class Chicken extends Bird implements CannotFly {

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

package com.chamil.codetest.model.bird;

import com.chamil.codetest.model.Swim;

public class Duck extends Bird implements Swim {
    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}

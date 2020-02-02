package com.chamil.codetest.model.bird;

import com.chamil.codetest.model.ISwim;

public class Duck extends Bird implements ISwim {
    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}

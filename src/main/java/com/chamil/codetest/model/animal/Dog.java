package com.chamil.codetest.model.animal;

import com.chamil.codetest.model.Animal;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }
}

package com.chamil.codetest.model.animal;

import com.chamil.codetest.model.Animal;

public class Cat  extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

package com.chamil.codetest.model.fish;

import com.chamil.codetest.model.Eat;

public class Shark extends Fish implements Eat {
    public Shark() {
        setColor("Grey");
        setSize("Large");
    }

    @Override
    public void eat() {
        System.out.println("I will eat other fish");
    }
}

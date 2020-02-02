package com.chamil.codetest.model.bird;

import com.chamil.codetest.model.Animal;

public class Bird extends Animal {
    /**
     *  flying ability of birds
     */
    public void fly() {
        System.out.println("I am flying");
    }

    /**
     *  Singing ability of birds
     */
    public void sing(){
        System.out.println("I am singing");
    }
}

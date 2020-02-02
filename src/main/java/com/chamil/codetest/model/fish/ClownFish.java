package com.chamil.codetest.model.fish;

import com.chamil.codetest.model.Joke;

public class ClownFish extends Fish implements Joke {

    public ClownFish() {
        setColor("Colorfull");
        setSize("Small");
    }


    @Override
    public void makeJoke() {
        System.out.println("I can make a joke");
    }
}

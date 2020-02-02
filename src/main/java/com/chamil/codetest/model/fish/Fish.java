package com.chamil.codetest.model.fish;

import com.chamil.codetest.model.Animal;
import com.chamil.codetest.model.CannotWalk;
import com.chamil.codetest.model.Swim;

public class Fish extends Animal implements Swim, CannotWalk {

    private String size;

    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}

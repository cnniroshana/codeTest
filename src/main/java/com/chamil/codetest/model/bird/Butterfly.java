package com.chamil.codetest.model.bird;

public class Butterfly extends Bird {

    private Type type;

    public Butterfly() {
        type = Type.BUTTERFLY;
    }

    public Butterfly(Type typeParam) {
        this.type = typeParam;
    }

    @Override
    public void makeSound() {
        System.out.println("I cannot make sound");
    }

    @Override
    public void fly() {
        if(type.equals(Type.CATERPILLAR)) {
            System.out.println("I cannot fly");
        }
    }

    public enum Type {
        BUTTERFLY,
        CATERPILLAR,
    }
}

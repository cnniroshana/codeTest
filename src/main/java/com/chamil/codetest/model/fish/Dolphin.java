package com.chamil.codetest.model.fish;

import com.chamil.codetest.model.Swim;

public class Dolphin implements Swim {
    @Override
    public void swim() {
        System.out.println("Im a good swimmer");
    }
}

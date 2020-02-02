package com.chamil.codetest.model.fish;

import com.chamil.codetest.CannotWalk;
import com.chamil.codetest.model.Animal;
import com.chamil.codetest.model.Swim;

public class Dolphin extends Animal implements Swim, CannotWalk {
    @Override
    public void swim() {
        System.out.println("Im a good swimmer");
    }

}

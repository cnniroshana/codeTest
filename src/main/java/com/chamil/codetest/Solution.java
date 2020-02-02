package com.chamil.codetest;

import com.chamil.codetest.model.*;
import com.chamil.codetest.model.animal.Cat;
import com.chamil.codetest.model.animal.Dog;
import com.chamil.codetest.model.bird.*;
import com.chamil.codetest.model.fish.ClownFish;
import com.chamil.codetest.model.fish.Dolphin;
import com.chamil.codetest.model.fish.Fish;
import com.chamil.codetest.model.fish.Shark;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Solution {
    public static void main(String[] args) {
        SpringApplication.run(Solution.class, args);
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        printStatics();
    }

    public static void printStatics() {

        int animalsCanFly = 0;
        int animalsCanWalk = 0;
        int animalsCanSing = 0;
        int animalsCanSwim = 0;

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };


        for (Animal animal : animals) {
            if(animal instanceof Bird && !(animal instanceof CannotFly)) {
                animalsCanFly++;
            }

            if(!(animal instanceof CannotWalk)) {
                animalsCanWalk++;
            }

            if(animal instanceof Swim) {
                animalsCanSwim++;
            }

            if(animal instanceof Bird) {
                animalsCanSing++;
            }

        }

        System.out.println("How many of these animals can fly : " + animalsCanFly);
        System.out.println("How many of these animals can sing : " + animalsCanSing);
        System.out.println("How many of these animals can walk : " + animalsCanWalk);
        System.out.println("How many of these animals can swim : " + animalsCanSwim);

    }
}

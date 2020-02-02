package com.chamil.codetest.model.bird;

import com.chamil.codetest.model.Animal;
import com.chamil.codetest.model.animal.Cat;
import com.chamil.codetest.model.animal.Dog;

public class Parrot extends Bird {

    private NearBy nearBy;

    public Parrot(NearBy nearByParam) {
        this.nearBy = nearByParam;
    }

    public enum NearBy {
        DOG,
        CAT,
        ROOSTER,
        DUCK,
        PHONE
    }

    /**
     * This method will determine the parrot's sound dynamically
     */
    @Override
    public void makeSound() {
        Animal animal;
        if(this.nearBy.equals(NearBy.CAT)) {
            animal = new Cat();
        }else if(this.nearBy.equals(NearBy.DOG)) {
            animal = new Dog();
        }else if (this.nearBy.equals(NearBy.ROOSTER)) {
            animal = new Rooster();
        }else if (this.nearBy.equals(NearBy.DUCK)) {
            animal = new Duck();
        }else {
            animal = new Animal();
        }
        animal.makeSound();
    }
}

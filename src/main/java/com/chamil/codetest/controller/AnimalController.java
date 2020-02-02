package com.chamil.codetest.controller;

import com.chamil.codetest.model.Animal;
import com.chamil.codetest.model.Frog;
import com.chamil.codetest.model.animal.Cat;
import com.chamil.codetest.model.animal.Dog;
import com.chamil.codetest.model.bird.*;
import com.chamil.codetest.model.fish.ClownFish;
import com.chamil.codetest.model.fish.Dolphin;
import com.chamil.codetest.model.fish.Shark;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @GetMapping("/getAnimal")
    public Animal greeting(@RequestParam(value = "type") String type) {

        if("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }else if("dog".equalsIgnoreCase(type)) {
            return new Dog();
        }else if("chicken".equalsIgnoreCase(type)) {
            return new Chicken();
        }else if("duck".equalsIgnoreCase(type)) {
            return new Duck();
        }else if("frog".equalsIgnoreCase(type)) {
            return new Frog();
        }else if("butterfly".equalsIgnoreCase(type)) {
            return new Butterfly();
        }else if("parrot".equalsIgnoreCase(type)) {
            return new Parrot();
        }else if("rooster".equalsIgnoreCase(type)) {
            return new Rooster();
        }else if("clownFish".equalsIgnoreCase(type)) {
            return new ClownFish();
        }else if("shark".equalsIgnoreCase(type)) {
            return new Shark();
        }else if("dolphin".equalsIgnoreCase(type)) {
            return new Dolphin();
        }
        return new Animal();
    }
}

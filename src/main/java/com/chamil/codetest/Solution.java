package com.chamil.codetest;

import com.chamil.codetest.model.Bird;
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
    }
}

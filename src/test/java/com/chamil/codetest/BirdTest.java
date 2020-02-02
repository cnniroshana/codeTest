package com.chamil.codetest;

import com.chamil.codetest.model.Bird;

import static org.mockito.Mockito.*;

public class BirdTest {

    private Bird bird;

    public void birdFly(){
        bird = mock(Bird.class);
        doNothing().when(bird).fly();
        bird.fly();
        verify(bird, times(1)).fly();
    }

    public void birdSing(){
        bird = mock(Bird.class);
        doNothing().when(bird).sing();
        bird.sing();
        verify(bird, times(1)).sing();
    }
}

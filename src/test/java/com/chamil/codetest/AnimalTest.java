package com.chamil.codetest;

import com.chamil.codetest.model.Animal;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AnimalTest {

    private Animal animal;

    @Test
    public void animalWalk(){
        animal = mock(Animal.class);
        doNothing().when(animal).walk();
        animal.walk();
        verify(animal, times(1)).walk();
    }
}

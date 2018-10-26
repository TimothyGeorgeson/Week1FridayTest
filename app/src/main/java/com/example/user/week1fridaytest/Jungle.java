package com.example.user.week1fridaytest;

import java.util.ArrayList;
import java.util.List;

public class Jungle {
    List<Animal> animals = new ArrayList<Animal>();

    enum Food {
        MEAT, FISH, BUGS, GRAIN
    }

    public void Add(Animal animal)
    {
        animals.add(animal);
    }

    public void soundOff()
    {
        for(int i=0; i<animals.size(); i++)
        {
            animals.get(i).makeSound();
            System.out.println(animals.get(i).name + "'s energy is now " + animals.get(i).energy);
        }

    }
}

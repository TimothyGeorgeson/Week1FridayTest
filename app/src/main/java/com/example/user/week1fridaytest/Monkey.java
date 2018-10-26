package com.example.user.week1fridaytest;

public class Monkey extends Animal{
    static int monkeyCount = 0;

    Monkey()
    {
        name = "Monkey";
        monkeyCount += 1;
    }
    @Override
    public void eatFood(Jungle.Food food) {
        energy += 2;
    }
    @Override
    public void makeSound() {
        energy -= 4;
        if(energy < 0)
            energy = 0;
    }

    public void play()
    {
        if(energy >= 8)
        {
            System.out.println("Oooo Oooo Oooo");
            energy -= 8;
        }
        else
        {
            System.out.println("Monkey is too tired");
        }

    }
}

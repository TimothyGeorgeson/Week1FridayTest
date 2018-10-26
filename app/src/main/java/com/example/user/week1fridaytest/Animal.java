package com.example.user.week1fridaytest;

public abstract class Animal {
    public String name;
    int energy;

    public void makeSound(){
        energy -= 3;
        if(energy < 0)
            energy = 0;
    }
    public void eatFood(Jungle.Food food){
        energy += 5;
    }
    public void sleep(){
        energy += 10;
    }

}

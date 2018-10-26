package com.example.user.week1fridaytest;

public class Tiger extends Animal {
    static int tigerCount = 0;

    Tiger()
    {
        name = "Tiger";
        tigerCount += 1;
    }

    @Override
    public void eatFood(Jungle.Food food) {
        if(food != Jungle.Food.GRAIN)
        {
            energy += 5;
        }
    }

    @Override
    public void sleep() {
        energy += 5;
    }
}

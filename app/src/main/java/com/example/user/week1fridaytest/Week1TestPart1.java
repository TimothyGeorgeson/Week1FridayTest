package com.example.user.week1fridaytest;

public class Week1TestPart1 {
    public static void main(String[] args) {
        Jungle jungle = new Jungle();
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        Monkey monkey = new Monkey();
        Snake snake = new Snake();

        jungle.Add(tiger1);
        jungle.Add(tiger2);
        jungle.Add(monkey);
        jungle.Add(snake);

        tiger1.sleep();
        tiger2.sleep();
        monkey.sleep();
        tiger1.sleep();
        snake.sleep();
        monkey.play();
        jungle.soundOff();
        monkey.play();
        tiger2.eatFood(Jungle.Food.GRAIN);

        System.out.println("Number of Tigers: " + Tiger.tigerCount);
        System.out.println("Tiger1 energy: " + tiger1.energy);
        System.out.println("Tiger2 energy: " + tiger2.energy);
        System.out.println("Monkey energy: " + monkey.energy);
        System.out.println("Snake energy: " + snake.energy);
    }
}


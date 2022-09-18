package com.ets.solid.InterfaceSegregation.positive;

public class Main {

    public static void main(String[] args) {
        Barkable dog = new Dogs();
        dog.bark();

        Runnable cat = new Cats();
        cat.run();

        Flyable bird = new Birds();
        bird.fly();
    }
}

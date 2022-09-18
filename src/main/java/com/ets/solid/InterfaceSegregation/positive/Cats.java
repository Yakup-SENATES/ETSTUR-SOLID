package com.ets.solid.InterfaceSegregation.positive;

public class Cats implements Runnable{
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

}

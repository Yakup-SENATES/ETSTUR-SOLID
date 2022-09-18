package com.ets.solid.InterfaceSegregation.positive;

public class Dogs implements Barkable,Runnable{
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}

package com.ets.solid.InterfaceSegregation.positive;

public class Birds implements Flyable,Runnable {
    @Override
    public void fly() {
        System.out.println("Birds can flying");
    }

    @Override
    public void run() {
        System.out.println("Birds can run");
    }
}

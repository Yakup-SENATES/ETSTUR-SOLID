package com.ets.solid.InterfaceSegregation.negative;

public class Dogs implements Animal {

    /*
    Köpekler koşar, havlar ama uçamazlar. Uçmayı köpek için boşuna implement etmiş olduk.
     */

    @Override
    public void run() {
        System.out.println("Dogs can run");
    }

    @Override
    public void fly() {
        // Do nothing
    }

    @Override
    public void bark() {
        System.out.println("Dogs can bark");
    }
}

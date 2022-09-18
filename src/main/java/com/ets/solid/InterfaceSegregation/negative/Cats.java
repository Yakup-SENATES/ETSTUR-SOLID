package com.ets.solid.InterfaceSegregation.negative;

public class Cats implements Animal {

    /*
    görüldüğü üzere burada cat sınıfı birden fazla metodu implement ederken hepsini kullanmıyor.
     */

    @Override
    public void run() {
        System.out.println("Cats can run");
    }

    @Override
    public void fly() {
        // do nothing
    }

    @Override
    public void bark() {
        // do nothing
    }
}

package com.ets.solid.InterfaceSegregation.negative;

public class Birds implements Animal {

    /*
    görüldüğü üzere burada bird sınıfı birden fazla metodu implement ederken hepsini kullanmıyor.
     */

    @Override
    public void run() {
        System.out.println("Birds can run");
    }

    @Override
    public void fly() {
        System.out.println("Birds can fly");
    }

    @Override
    public void bark() {
        // do nothing
    }
}

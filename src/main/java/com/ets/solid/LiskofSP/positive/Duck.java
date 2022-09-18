package com.ets.solid.LiskofSP.positive;

public class Duck extends FlyingBirds {


    public void swim() {
        System.out.println("Yüzüyorum: " + this.getClass().getSimpleName());
    }
}

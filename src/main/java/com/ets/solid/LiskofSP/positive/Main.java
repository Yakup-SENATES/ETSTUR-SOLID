package com.ets.solid.LiskofSP.positive;

public class Main {

        public static void main(String[] args) {
            Duck duck = new Duck();
            Ostrich ostrich = new Ostrich();

            duck.fly();
            duck.swim();

            ostrich.run();
           // ostrich.fly(); yapamayız
        }
}

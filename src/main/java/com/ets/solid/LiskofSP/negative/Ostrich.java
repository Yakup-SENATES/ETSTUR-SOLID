package com.ets.solid.LiskofSP.negative;

public class Ostrich extends Bird{

    /*
    *  DeveKuşu uçamaz, bu yüzden fly methodunu override etmemeliyiz.
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }

}

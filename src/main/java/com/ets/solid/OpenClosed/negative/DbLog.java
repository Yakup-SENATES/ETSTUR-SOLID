package com.ets.solid.OpenClosed.negative;

public class DbLog {

    public boolean log(String message) {
        System.out.println("Logging to database: " + message);
        return true;
    }
}

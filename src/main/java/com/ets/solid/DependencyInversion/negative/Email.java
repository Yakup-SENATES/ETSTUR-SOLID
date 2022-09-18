package com.ets.solid.DependencyInversion.negative;

public class Email {

    public void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }
}

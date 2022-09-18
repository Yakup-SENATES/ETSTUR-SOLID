package com.ets.solid.DependencyInversion.positive;

public class Email implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }

}

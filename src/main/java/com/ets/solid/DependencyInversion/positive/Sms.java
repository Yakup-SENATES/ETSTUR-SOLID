package com.ets.solid.DependencyInversion.positive;

public class Sms implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sms: " + message);
    }

}

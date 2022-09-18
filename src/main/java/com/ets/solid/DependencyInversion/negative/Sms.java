package com.ets.solid.DependencyInversion.negative;

public class Sms {
    public void sendSms(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

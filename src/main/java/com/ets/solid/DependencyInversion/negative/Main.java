package com.ets.solid.DependencyInversion.negative;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.sender();
    }
}

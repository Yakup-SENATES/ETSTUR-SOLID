package com.ets.solid.DependencyInversion.positive;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            Notification notification = new Notification(new ArrayList<>(List.of(new Sms(), new Email())));
            notification.sender();
        }
}

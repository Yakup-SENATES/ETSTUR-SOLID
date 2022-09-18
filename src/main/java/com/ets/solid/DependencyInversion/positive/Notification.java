package com.ets.solid.DependencyInversion.positive;

import java.util.List;

public class Notification {
    /*
    * 1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
    * 2. Abstractions should not depend on details. Details should depend on abstractions.
    * Artık Notification sınıfı Sms ve Email sınıflarına bağımlı değil. Sms ve Email sınıfları Message
    * arayüzüne bağımlı. Message arayüzüne bağımlı olması Notification sınıfda değişiklik yapmamızı engeller.
     */

    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender() {
        for (Message message : messages) {
            message.sendMessage( "Hello World" );
        }
    }

}

package com.ets.solid.OpenClosed.pozitive;

public class DbLog implements ILogger {

    @Override
    public void log(String message) {
        //tüm işlemler
        System.out.println("Db loglandı: "+message);
    }
}

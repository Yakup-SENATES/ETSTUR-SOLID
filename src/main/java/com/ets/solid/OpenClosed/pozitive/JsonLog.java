package com.ets.solid.OpenClosed.pozitive;

public class JsonLog implements ILogger {

    @Override
    public void log(String message) {
        //tüm işlemler
        System.out.println("Json loglandı: "+message);
    }

}

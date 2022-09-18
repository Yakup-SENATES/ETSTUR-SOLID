package com.ets.solid.OpenClosed.pozitive;

public class Logger {

    private final ILogger logger;

    public Logger(ILogger logger) {
        this.logger = logger;
    }

    public void log(String message) {
       logger.log(message);
    }

    public static void main(String[] args) {
        Logger logger = new Logger(new JsonLog());
        logger.log("test");
    }
}

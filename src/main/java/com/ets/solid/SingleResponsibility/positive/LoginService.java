package com.ets.solid.SingleResponsibility.positive;

public class LoginService {
    public void login(String username) {
        //log-in logic
        System.out.println("User logged: " + username);
    }

    public void logout(String username) {
        //log-out logic
        System.out.println("User logged out: " + username);
    }

}

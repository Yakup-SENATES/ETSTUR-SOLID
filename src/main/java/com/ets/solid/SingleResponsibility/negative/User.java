package com.ets.solid.SingleResponsibility.negative;

public class User {

    /*
    field'lar da doğrudan user classında tutulması gerekmeyen veriler de var.
    Herhangi bir ek adres bilgisi istendiğinde(country yada zipCode gibi) burada tamamen User sınıfını etkileyecektir.
    User sınıfı direkt olarak sorumlu olmadığı bir işlemden etkilenmiş olacak.
    “street”, “city” gibi veriler sadece adres için gereklidir
     */

    private Long id;
    private String name;
    private String street;
    private String city;
    private String username;

    //Getters, setters


    /*
    Ayrıca her işlemin bu class da yapılmaması gerek .
    Bu classın tek sorumluluğu user bilgilerini tutmak olmalıdır.
    Bu sebeple login, logout, changeAddress gibi işlemler bu classın içinde yer almamalıdır.
     */

    public void changeAddress(String street, String city) {
        //logic
    }

    public void login(String username) {
        //logic
    }

    public void logout(String username) {
        //logic
    }
}
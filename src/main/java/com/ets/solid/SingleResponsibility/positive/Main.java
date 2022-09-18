package com.ets.solid.SingleResponsibility.positive;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, new Address("street", "city", "country"));

        AddressService addressService = new AddressService();
        addressService.changeAddress(user.getAddress());

    }
}

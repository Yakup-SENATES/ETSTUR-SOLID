package com.ets.solid.SingleResponsibility.positive;

public class AddressService {

    public void changeAddress(Address address) {
        // Sadece addressle ilgileniyorum ve ondan sorumluyum userdaki değişiklikler beni etkilemez.
        //logic
        System.out.println("Address changed: " + address.getCountry());
    }
}

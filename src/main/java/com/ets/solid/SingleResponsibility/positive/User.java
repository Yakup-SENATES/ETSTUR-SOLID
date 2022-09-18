package com.ets.solid.SingleResponsibility.positive;

import com.ets.solid.SingleResponsibility.positive.Address;

public class User {
    private Long id;
    private Address address;

    //Getter,setter

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(Long id, Address address) {
        this.id = id;
        this.address = address;
    }
}

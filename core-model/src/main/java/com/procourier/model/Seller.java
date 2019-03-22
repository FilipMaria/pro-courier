package com.procourier.model;

import java.util.Objects;

public final class Seller {
    private String name;
    private String description;
    private Address address;


    public Seller(String name, String description, Address address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public Seller(String name, Address address) {
        this(name," ",address);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }
}

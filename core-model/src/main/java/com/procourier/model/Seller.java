package com.procourier.model;

import java.util.Objects;

public final class Seller {
    private String name;
    private Address address;
    private String description;

    public Seller(String name, Address address, String description) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
        this.description = Objects.requireNonNull(description);
    }

    public Seller(String name, Address address) {
        this(name,address,description=" ");
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }
}

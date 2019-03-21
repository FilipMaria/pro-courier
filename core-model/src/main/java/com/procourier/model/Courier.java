package com.procourier.model;

import java.util.Objects;

public final class Courier {
    private Long ID;
    private String companyName;
    private Address headquarters;
    private Long pricePerDistance;
    private Long pricePerWeight;

    public Courier(Long ID,String companyName, Address headquarters, Long pricePerDistance, Long pricePerWeight) {
        this.ID=Objects.requireNonNull(ID);
        this.companyName = Objects.requireNonNull(companyName);
        this.headquarters = Objects.requireNonNull(headquarters);
        this.pricePerDistance = Objects.requireNonNull(pricePerDistance);
        this.pricePerWeight = Objects.requireNonNull(pricePerWeight);
    }

    public String getCompanyName() {
        return companyName;
    }

    public Long getID() {
        return ID;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public Long getPricePerDistance() {
        return pricePerDistance;
    }

    public Long getPricePerWeight() {
        return pricePerWeight;
    }
}

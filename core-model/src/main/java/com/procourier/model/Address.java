package com.procourier.model;

<<<<<<< HEAD
import java.util.Objects;

public class Address {
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import static java.util.Objects.requireNonNull;
@Entity
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    private String region;
    private String city;
    private String street;
    private String streetNumber;

<<<<<<< HEAD
    public Address(String region, String city, String street, String streetNumber) {
        this.region = Objects.requireNonNull(region);
        this.city = Objects.requireNonNull(city);
        this.street = Objects.requireNonNull(street);
        this.streetNumber = Objects.requireNonNull(streetNumber);
    }

    public Address(String region, String city, String street) {
        this(region,city,street,"");
=======
    public Address() {
    }

    public Address(String region, String city, String street, String streetNumber) {
        this.region = requireNonNull(region);
        this.city = requireNonNull(city);
        this.street = requireNonNull(street);
        this.streetNumber = requireNonNull(streetNumber);
    }

    public Address(String region, String city, String street) {
        this(region, city, street, "");
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Address{" +
                "region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

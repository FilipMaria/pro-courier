package com.procourier.model;

<<<<<<< HEAD
import java.util.Objects;

public final class Buyer {
    private String name;
    private Address address;

    public Buyer(String name, Address address) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
=======
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import static java.util.Objects.requireNonNull;

@Entity
@Table(name="buyers")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Buyer() {
    }

    public Buyer(String name, Address address) {
        this.name = requireNonNull(name);
        this.address = requireNonNull(address);
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

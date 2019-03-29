package com.procourier.model;

<<<<<<< HEAD
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
@Table(name="sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Seller() {
    }

    public Seller(String name, String description, Address address) {
        this.name = requireNonNull(name);
        this.description = requireNonNull(description);
        this.address = requireNonNull(address);
    }

    public Seller(String name, Address address) {
        this(name, "", address);
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
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
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                '}';
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

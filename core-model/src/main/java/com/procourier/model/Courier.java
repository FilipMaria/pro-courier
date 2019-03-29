package com.procourier.model;

<<<<<<< HEAD
import java.util.Objects;

public final class Courier {
    private Long ID;
    private String companyName;
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
@Table(name="couriers")
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    @OneToOne(cascade = CascadeType.ALL)
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    private Address headquarters;
    private Long pricePerDistance;
    private Long pricePerWeight;

<<<<<<< HEAD
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
=======
    public Courier() {
    }

    public Courier(String companyName, Address headquarters, Long pricePerDistance, Long pricePerWeight) {
        this.companyName = requireNonNull(companyName);
        this.headquarters = requireNonNull(headquarters);
        this.pricePerDistance = requireNonNull(pricePerDistance);
        this.pricePerWeight = requireNonNull(pricePerWeight);
    }

    public String getCompanyName() {
        return companyName;
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
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
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Courier{" +
                "companyName='" + companyName + '\'' +
                ", headquarters=" + headquarters +
                ", pricePerDistance=" + pricePerDistance +
                ", pricePerWeight=" + pricePerWeight +
                '}';
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

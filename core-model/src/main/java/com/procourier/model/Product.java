package com.procourier.model;

<<<<<<< HEAD
import java.util.Objects;

public final class Product {
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import static java.util.Objects.requireNonNull;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    private Long price;
    private String name;
    private String description;
    private Long weight;

<<<<<<< HEAD

    public Product(Long price, String name, String description, Long weight) {
        this.price = Objects.requireNonNull(price);
        this.name = Objects.requireNonNull(name);
        this.description = Objects.requireNonNull(description);
        this.weight = checkWeight(weight);
    }
    private static Long checkWeight(Long weight){
        if(weight <= 0){
            throw new IllegalArgumentException("weight must be non negative");
        }
        return Objects.requireNonNull(weight);
=======
    public Product() {
    }

    public Product(Long price, String name, String description, Long weight) {
        this.price = requireNonNull(price);
        this.name = requireNonNull(name);
        this.description = requireNonNull(description);
        this.weight = checkWeight(weight);
    }

    private static Long checkWeight(Long weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be non negative");
        }

        return requireNonNull(weight);
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getWeight() {
        return weight;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

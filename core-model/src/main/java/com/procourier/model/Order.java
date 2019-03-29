package com.procourier.model;

<<<<<<< HEAD
import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public final class Order {
    private Long ID;
    private Seller seller;
    private Buyer buyer;
    private Courier courier;
    private Instant submittedDate;
    private Map<Product, Integer>orderLines;

    public Order(Long ID, Seller seller, Buyer buyer, Courier courier, Instant submittedDate, Map<Product, Integer> orderLines) {
        this.ID=Objects.requireNonNull(ID);
        this.seller = Objects.requireNonNull(seller);
        this.buyer = Objects.requireNonNull(buyer);
        this.courier = Objects.requireNonNull(courier);
        this.submittedDate = Objects.requireNonNull(submittedDate);
        this.orderLines = Collections.unmodifiableMap(orderLines);
    }

    public Order(Long ID, Seller seller, Buyer buyer, Courier courier, Map<Product, Integer> orderLines) {
        this(ID, seller, buyer, courier, Instant.now(), orderLines);
    }

    public Seller getSeller() {
        return seller;
    }

    public Long getID() {
        return ID;
=======
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;

import static java.util.Collections.unmodifiableList;
import static java.util.Objects.requireNonNull;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Seller seller;

    @ManyToOne(cascade = CascadeType.ALL)
    private Buyer buyer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Courier courier;

    private Instant submittedDate;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLine> orderLines;

    public Order() {
    }

    public Order(Seller seller, Buyer buyer, Courier courier, List<OrderLine> orderLines) {
        this.seller = seller;
        this.buyer = buyer;
        this.courier = courier;
        this.orderLines = orderLines;
    }

    public Order(Seller seller, Buyer buyer,
                 Courier courier, Instant submittedDate, List<OrderLine> orderLines) {
        this.seller = requireNonNull(seller);
        this.buyer = requireNonNull(buyer);
        this.courier = requireNonNull(courier);
        this.submittedDate = requireNonNull(submittedDate);
        this.orderLines = unmodifiableList(orderLines);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Courier getCourier() {
        return courier;
    }

    public Instant getSubmittedDate() {
        return submittedDate;
    }

<<<<<<< HEAD
    public Map<Product, Integer> getOrderLines() {
        return orderLines;
    }


=======
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                " seller=" + seller +
                ", buyer=" + buyer +
                ", courier=" + courier +
                ", submittedDate=" + submittedDate +
                ", orderLines=" + orderLines +
                '}';
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

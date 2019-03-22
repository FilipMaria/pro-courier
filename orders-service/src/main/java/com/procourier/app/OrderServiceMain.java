package com.procourier.app;

import com.procourier.model.*;
import spark.Spark;

import java.util.Map;


public class OrderServiceMain {
    public static void main(String[] args){
        final var repository=new com.procourier.repository.CollectionRepository();
        final var handler = new OrdersHandler(repository);

        final Address address= new Address("DJ","Craiova","Nicolae Titulescu");
        final Seller seller= new Seller("Evomag",address);

        final Address cosminAddress= new Address("DJ","Craiova","Ileana Cosanzeana");
        final Buyer buyer=new Buyer("Cosmin", cosminAddress);

        final Address courierAddress = new Address("DJ","Craiova","Nicolae Titulescu");
        final Courier courier= new Courier(1L,"ExpressFan", courierAddress,5L,7L);

        final var products = Map.of(new Product(20L,"Jeans","Men Jeans",22L));

        final Order order = new Order(6L,seller,buyer,courier,products);
        repository.put(order);


        Spark.port(8082);
        Spark.threadPool(26,10,2000);
        Spark.get("/orders/:ID", handler);
    }
}

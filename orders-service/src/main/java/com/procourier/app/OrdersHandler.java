package com.procourier.app;

import com.procourier.model.Order;
import com.procourier.model.repository.OrderRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.Objects;
import java.util.Optional;

public final class OrdersHandler implements Route {
    private final OrderRepository repository;

    public OrdersHandler(OrderRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }


        @Override
        public Object handle(Request request, Response response) throws Exception {
            final String ID =request.params(":ID");
            final Long longID=Long.valueOf(ID);

            final Optional<Order> order= repository.findById(longID);
            final String info= order.map(o -> o.getID() + " " + o.getBuyer().getName()).orElse("Not found");

            return info;

        }

}

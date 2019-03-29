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

<<<<<<< HEAD

        @Override
        public Object handle(Request request, Response response) throws Exception {
            final String ID =request.params(":ID");
            final Long longID=Long.valueOf(ID);

            final Optional<Order> order= repository.findById(longID);
            final String info= order.map(o -> o.getID() + " " + o.getBuyer().getName()).orElse("Not found");

            return info;

        }

=======
    @Override
    public Object handle(Request request, Response response) throws Exception {
        final String id = request.params(":id");
        final Long longId = Long.valueOf(id);

        final Optional<Order> order = repository.findById(longId);
        final String info = order.map(o -> o.getBuyer().getName() + " a cumparat de la " + o.getSeller().getName() + " si coletul a fost expediat prin " + o.getCourier().getCompanyName())
                .orElse("Not found");

        return info;
    }
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
}

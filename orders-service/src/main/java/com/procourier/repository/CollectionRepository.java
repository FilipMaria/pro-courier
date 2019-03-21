package com.procourier.repository;

import com.procourier.model.Order;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionRepository implements OrderRepository{

    private final Map<Long, Order> orders = new HashSet<>();


    @Override
    public Optional<Order> findById(Long ID) {
        return Optional.ofNullable(orders.get(ID));
    }

    @Override
    public List<Order> getall() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Long put(Order item) {
        orders.put(item.getID(), item);
        return item.getID();
    }

    @Override
    public List<Long> putAll(List<Order> items) {
        final var ids = items.stream().map(Order::getID).collect(Collectors.toList());
        final Map<Long, Order> newValues = items.stream().collect(Collectors.toMap(Order::getID, Function.identity()));
        orders.putAll(newValues);

        return ids;

    }
}

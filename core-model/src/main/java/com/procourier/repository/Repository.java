package com.procourier.repository;


import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Optional<T> findById(Long ID);
    List<T> getall();
    Long put(T item);
    List<Long> putAll(List<T> items);
}

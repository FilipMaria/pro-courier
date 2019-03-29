package com.procourier.model.repository;

<<<<<<< HEAD

=======
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
import java.util.List;
import java.util.Optional;

public interface Repository<T> {
<<<<<<< HEAD
    Optional<T> findById(Long ID);
    List<T> getall();
=======
    Optional<T> findById(Long id);
    List<T> getAll();
>>>>>>> cef27b5c336e31305fb99f676eba2824b431dd1b
    Long put(T item);
    List<Long> putAll(List<T> items);
}

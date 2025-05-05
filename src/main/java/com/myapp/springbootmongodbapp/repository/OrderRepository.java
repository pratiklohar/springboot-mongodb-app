package com.myapp.springbootmongodbapp.repository;

import com.myapp.springbootmongodbapp.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    // Define additional custom queries here if needed
}
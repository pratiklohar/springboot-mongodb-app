package com.myapp.springbootmongodbapp.repository;

import com.myapp.springbootmongodbapp.model.OrderDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends MongoRepository<OrderDetail, Integer> {
    // Define additional custom queries here if needed
}
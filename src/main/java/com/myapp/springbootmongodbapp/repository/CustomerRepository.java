package com.myapp.springbootmongodbapp.repository;

import com.myapp.springbootmongodbapp.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    // Define additional custom queries here if needed


    // Check if a customer with the same mobile number exists.
    boolean existsByMobileNumber(String mobileNumber);
}
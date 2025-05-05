package com.myapp.springbootmongodbapp.service;

import com.myapp.springbootmongodbapp.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    // Define methods for customer service operations
    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomerById(String customerId);

    CustomerDto addCustomer(CustomerDto customerDto);

    CustomerDto updateCustomer(String customerId, CustomerDto customerDto);

    void deleteCustomer(String customerId);
}

package com.myapp.springbootmongodbapp.service.impl;


import com.myapp.springbootmongodbapp.constants.ErrorMessages;
import com.myapp.springbootmongodbapp.dto.CustomerDto;
import com.myapp.springbootmongodbapp.exception.ResourceNotFoundException;
import com.myapp.springbootmongodbapp.model.Customer;
import com.myapp.springbootmongodbapp.repository.CustomerRepository;
import com.myapp.springbootmongodbapp.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public CustomerDto getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId)
                .map(this::toDto)
                .orElseThrow(() -> new ResourceNotFoundException(ErrorMessages.CUSTOMER_NOT_FOUND));
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        return toDto(customerRepository.save(toEntity(customerDto)));
    }

    @Override
    public CustomerDto updateCustomer(Integer customerId, CustomerDto customerDto) {
        var customer = customerRepository.findById(customerId).orElseThrow(() -> new ResourceNotFoundException(ErrorMessages.CUSTOMER_NOT_FOUND));
        return toDto(customerRepository.save(customer));
    }


    @Override
    public void deleteCustomer(Integer customerId) {
        if (!customerRepository.existsById(customerId)) {
            throw new ResourceNotFoundException(ErrorMessages.CUSTOMER_NOT_FOUND);
        }
        customerRepository.deleteById(customerId);
    }


    // Convert the Customer entity to customer DTO
    private CustomerDto toDto(Customer customer) {
        return new CustomerDto(
                customer.getCustomerId(),
                customer.getCustomerName(),
                customer.getAddress(),
                customer.getCity(),
                customer.getPostalCode(),
                customer.getCountry(),
                customer.getState(),
                customer.getMobileNumber()
        );
    }

    // Convert the customer DTO to Entity.
    private Customer toEntity(CustomerDto customerDto) {
        return new Customer(
                customerDto.customerId(),
                customerDto.customerName(),
                customerDto.address(),
                customerDto.city(),
                customerDto.postalCode(),
                customerDto.country(),
                customerDto.state(),
                customerDto.mobileNumber()
        );
    }

}

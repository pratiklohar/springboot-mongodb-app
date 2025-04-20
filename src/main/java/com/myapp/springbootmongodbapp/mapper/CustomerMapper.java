package com.myapp.springbootmongodbapp.mapper;

import com.myapp.springbootmongodbapp.dto.CustomerDto;
import com.myapp.springbootmongodbapp.model.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toEntity(CustomerDto customerDto);
    CustomerDto toDto(Customer customer);
    List<CustomerDto> toDtoList(List<Customer> customerList);
}
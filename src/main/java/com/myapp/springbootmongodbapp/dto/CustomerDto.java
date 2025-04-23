package com.myapp.springbootmongodbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private Integer customerId;
    private String customerName;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String state;
}
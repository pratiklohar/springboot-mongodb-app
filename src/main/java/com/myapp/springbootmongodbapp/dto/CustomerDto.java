package com.myapp.springbootmongodbapp.dto;

import jakarta.validation.constraints.NotBlank;

public record CustomerDto(
        Integer customerId,
        @NotBlank(message = "Customer name is required")
        String customerName,
        String address,
        String city,
        String postalCode,
        String country,
        String state,
        @NotBlank(message = "Mobile number is required")
        String mobileNumber
) {
}
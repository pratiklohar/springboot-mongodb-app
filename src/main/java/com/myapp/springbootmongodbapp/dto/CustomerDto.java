package com.myapp.springbootmongodbapp.dto;

import jakarta.validation.constraints.NotBlank;


public record CustomerDto(
        String customerId,
        @NotBlank(message = "First name is required")
        String firstName,
        @NotBlank(message = "Last name is required")
        String lastName,
        String address,
        String city,
        String postalCode,
        String country,
        String state,
        @NotBlank(message = "Mobile number is required")
        String mobileNumber
) {
}
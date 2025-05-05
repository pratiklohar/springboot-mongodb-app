package com.myapp.springbootmongodbapp.dto;

import java.time.LocalDate;


public record OrderDto(
        String orderId,
        String customerId,
        LocalDate orderDate
) {
}

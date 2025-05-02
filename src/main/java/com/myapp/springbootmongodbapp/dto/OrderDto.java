package com.myapp.springbootmongodbapp.dto;

import java.time.LocalDate;

public record OrderDto(
        Integer orderId,
        Integer customerId,
        LocalDate orderDate
) {
}

package com.myapp.springbootmongodbapp.dto;

public record OrderDetailDto(
        Integer orderDetailId,
        Integer orderId,
        Integer productId,
        Integer quantity
) {
}

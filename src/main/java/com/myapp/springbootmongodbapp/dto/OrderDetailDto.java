package com.myapp.springbootmongodbapp.dto;


public record OrderDetailDto(
        String orderDetailId,
        String orderId,
        String productId,
        Integer quantity
) {
}

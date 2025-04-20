package com.myapp.springbootmongodbapp.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailDto {
    private Long orderDetailId;
    private Long orderId;
    private Long productId;
    private Integer quantity;
}
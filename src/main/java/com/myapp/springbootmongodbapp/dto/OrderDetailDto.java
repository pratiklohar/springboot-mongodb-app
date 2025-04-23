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
    private Integer orderDetailId;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
}
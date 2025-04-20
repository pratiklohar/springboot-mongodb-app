package com.myapp.springbootmongodbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long productId;
    private String productName;
    private Long categoryId;
    private Double price;
    private Integer quantity;
    private Double unitWeight;
    private String weightType;
    private String packagingType;
}


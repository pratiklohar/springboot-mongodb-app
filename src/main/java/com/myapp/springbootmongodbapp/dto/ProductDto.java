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
    private Integer productId;
    private String productName;
    private Integer categoryId;
    private Double price;
    private Integer quantity;
    private Integer unitWeight;
    private String weightType;
    private String packagingType;
}


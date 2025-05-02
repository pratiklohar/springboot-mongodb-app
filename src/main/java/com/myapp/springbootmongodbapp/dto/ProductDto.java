package com.myapp.springbootmongodbapp.dto;

public record ProductDto(
        Integer productId,
        String productName,
        Integer categoryId,
        Double price,
        Integer quantity,
        Integer unitWeight,
        String weightType,
        String packagingType
        ) {
}


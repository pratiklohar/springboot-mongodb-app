package com.myapp.springbootmongodbapp.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductDto(
        Integer productId,
        @NotBlank(message = "Product name is required")
        String productName,
        @NotBlank(message = "Category ID is required")
        Integer categoryId,
        @NotBlank(message = "Price is required")
        Double price,
        @NotBlank(message = "Quantity is required")
        Integer quantity,
        @NotBlank(message = "Unit weight is required")
        Integer unitWeight,
        @NotBlank(message = "Weight type is required")
        String weightType,
        @NotBlank(message = "Packaging type is required")
        String packagingType
) {
}


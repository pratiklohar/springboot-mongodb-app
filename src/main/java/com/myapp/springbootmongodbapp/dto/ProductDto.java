package com.myapp.springbootmongodbapp.dto;

import jakarta.validation.constraints.*;


public record ProductDto(
        String productId,
        @NotBlank(message = "Product name is required")
        String productName,
        @NotNull(message = "Category ID is required")
        String categoryId,
        @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
        @NotNull(message = "Price is required")
        Double price,
        @Min(value = 1, message = "Minimum quantity is 1")
        @NotNull(message = "Quantity is required")
        Integer quantity,
        @Positive(message = "Must be positive")
        @NotNull(message = "Unit weight is required")
        Integer unitWeight,
        @NotBlank(message = "Weight type is required")
        String weightType,
        @NotBlank(message = "Packaging type is required")
        String packagingType
) {
}


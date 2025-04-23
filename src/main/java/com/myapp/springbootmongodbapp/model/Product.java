package com.myapp.springbootmongodbapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")
public class Product {
    @Id
    private Integer productId;
    private String productName;
    private Integer categoryId;
    private Double price;
    private Integer quantity;
    private Integer unitWeight;
    private String weightType;
    private String packagingType;
}

package com.myapp.springbootmongodbapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {

    @Id
    private String productId;
    private String productName;
    private String categoryId;
    private Double price;
    private Integer quantity;
    private Integer unitWeight;
    private String weightType;
    private String packagingType;
}

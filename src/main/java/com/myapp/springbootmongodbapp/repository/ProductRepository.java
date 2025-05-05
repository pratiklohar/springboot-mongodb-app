package com.myapp.springbootmongodbapp.repository;

import com.myapp.springbootmongodbapp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    // Define additional custom queries here if needed
    // For example, you can add methods to find products by name, category, etc.
    // Example: List<Product> findByName(String name);

    // Check if a product with the same name, category ID, unit weight, and weight type exists.
    boolean existsByProductNameAndCategoryIdAndUnitWeightAndWeightType(
            String productName,
            String categoryId,
            Integer unitWeight,
            String weightType
    );
}


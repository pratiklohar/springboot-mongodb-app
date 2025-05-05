package com.myapp.springbootmongodbapp.service;

import com.myapp.springbootmongodbapp.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProducts();

    ProductDto getProductById(String productId);

    ProductDto addProduct(ProductDto productDto);

    ProductDto updateProduct(String productId, ProductDto productDto);

    void deleteProduct(String productId);
}

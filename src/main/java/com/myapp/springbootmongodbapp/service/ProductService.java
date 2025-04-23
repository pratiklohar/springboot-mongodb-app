package com.myapp.springbootmongodbapp.service;

import com.myapp.springbootmongodbapp.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProducts();

    ProductDto getProductByProductId(Integer productId);

    ProductDto addProduct(ProductDto productDto);

    ProductDto updateProduct(Integer productId, ProductDto productDto);

    void deleteProduct(Integer productId);
}

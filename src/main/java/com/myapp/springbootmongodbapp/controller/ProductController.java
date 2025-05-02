package com.myapp.springbootmongodbapp.controller;

import com.myapp.springbootmongodbapp.dto.ApiResponse;
import com.myapp.springbootmongodbapp.dto.ProductDto;
import com.myapp.springbootmongodbapp.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<ProductDto>>> getAllProducts() {
        return ResponseEntity.ok(ApiResponse.success(productService.getAllProducts()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ProductDto>> getProductById(@PathVariable Integer id) {
        return ResponseEntity.ok(ApiResponse.success(productService.getProductById(id)));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<ProductDto>> addProduct(@RequestBody @Valid ProductDto productDto) {
        return ResponseEntity.ok(ApiResponse.success(productService.addProduct(productDto)));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ApiResponse<ProductDto>> updateProduct(@PathVariable Integer id, @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(ApiResponse.success(productService.updateProduct(id, productDto)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok(ApiResponse.success(null));
    }
}

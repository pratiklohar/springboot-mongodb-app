package com.myapp.springbootmongodbapp.service.impl;

import com.myapp.springbootmongodbapp.constants.ErrorMessages;
import com.myapp.springbootmongodbapp.dto.ProductDto;
import com.myapp.springbootmongodbapp.exception.ResourceNotFoundException;
import com.myapp.springbootmongodbapp.model.Product;
import com.myapp.springbootmongodbapp.repository.ProductRepository;
import com.myapp.springbootmongodbapp.service.ProductService;
import com.myapp.springbootmongodbapp.util.IdGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public ProductDto getProductById(String productId) {
        return productRepository.findById(productId)
                .map(this::toDto)
                .orElseThrow(() -> new ResourceNotFoundException(ErrorMessages.PRODUCT_NOT_FOUND));
    }

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        if (productRepository.existsByProductNameAndCategoryIdAndUnitWeightAndWeightType(productDto.productName(), productDto.categoryId(), productDto.unitWeight(), productDto.weightType())) {
            throw new RuntimeException(ErrorMessages.PRODUCT_EXIST);
        }
        var product = toEntity(productDto);
        product.setProductId(IdGenerator.generateId());
        return toDto(productRepository.save(product));
    }

    @Override
    public ProductDto updateProduct(String productId, ProductDto productDto) {
        if (!productRepository.existsById(productId)) {
            throw new ResourceNotFoundException(ErrorMessages.PRODUCT_NOT_FOUND);
        }
        var product = toEntity(productDto);
        product.setProductId(productId);
        return toDto(productRepository.save(product));
    }

    @Override
    public void deleteProduct(String productId) {
        if (!productRepository.existsById(productId)) {
            throw new ResourceNotFoundException(ErrorMessages.PRODUCT_NOT_FOUND);
        }
        productRepository.deleteById(productId);
    }

    // Convert the Product entity to Product DTO
    private ProductDto toDto(Product product) {
        return new ProductDto(
                product.getProductId(),
                product.getProductName(),
                product.getCategoryId(),
                product.getPrice(),
                product.getQuantity(),
                product.getUnitWeight(),
                product.getWeightType(),
                product.getPackagingType()
        );
    }

    // Convert the Product DTO to Product entity
    private Product toEntity(ProductDto productDto) {
        return new Product(
                productDto.productId(),
                productDto.productName(),
                productDto.categoryId(),
                productDto.price(),
                productDto.quantity(),
                productDto.unitWeight(),
                productDto.weightType(),
                productDto.packagingType()
        );
    }
}


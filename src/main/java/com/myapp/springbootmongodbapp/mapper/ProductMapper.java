package com.myapp.springbootmongodbapp.mapper;

import com.myapp.springbootmongodbapp.dto.ProductDto;
import com.myapp.springbootmongodbapp.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductMapper {

    Product toEntity(ProductDto productDto);
    ProductDto toDto(Product product);
    List<ProductDto> toDtoList(List<Product> productList);
    // This method will update the entity using only non-null fields from DTO
    void updateProductFromDto(ProductDto productDto, @MappingTarget Product product);
}

package com.myapp.springbootmongodbapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "categories")
public class Category {

    @Id
    private String categoryId;
    private String categoryName;
    private String description;

}

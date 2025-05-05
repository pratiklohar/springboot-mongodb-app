package com.myapp.springbootmongodbapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customers")
public class Customer {

    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String state;
    private String mobileNumber;
}
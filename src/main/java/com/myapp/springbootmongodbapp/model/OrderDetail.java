package com.myapp.springbootmongodbapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order_details")
public class OrderDetail {

    @Id
    private String orderDetailId;
    private String orderId;
    private String productId;
    private Integer quantity;
}



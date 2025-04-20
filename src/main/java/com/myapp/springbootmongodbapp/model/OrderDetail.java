package com.myapp.springbootmongodbapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "orderDetails")
public class OrderDetail {

    @Id
    private Long orderDetailId;
    private Long orderId;
    private Long productId;
    private Integer quantity;
}



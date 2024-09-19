package com.orderservice.demo.entiy;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Table("orders")
@Data
public class Order {
    @Id
    private Long id;
    private Long userId;
    private Long productId;
    private String status;
}
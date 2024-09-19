package com.ProductService.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Table("products")
@Data
public class Product {
    @Id
    private Long id;
    private String name;
    private Double price;

    
}

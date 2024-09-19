package com.ProductService.demo.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.ProductService.demo.entity.Product;

public interface ProductRepository extends R2dbcRepository<Product, Long> {
}

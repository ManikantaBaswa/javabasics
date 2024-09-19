package com.orderservice.demo.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.orderservice.demo.entiy.Order;

public interface OrderRepository extends R2dbcRepository<Order, Long> {

}

package com.sample.api.demo.repository;

import com.sample.api.demo.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, String> {
    OrderModel save(OrderModel client);
}

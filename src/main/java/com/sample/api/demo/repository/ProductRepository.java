package com.sample.api.demo.repository;

import com.sample.api.demo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    ProductModel save(ProductModel client);
}

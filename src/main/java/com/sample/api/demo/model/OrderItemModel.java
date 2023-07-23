package com.sample.api.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Entity(name = "itempedido")
@Data
public class OrderItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProductModel product;
    private BigDecimal valor;

}

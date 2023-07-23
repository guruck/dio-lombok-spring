package com.sample.api.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "pedido")
@Data
public class OrderModel {

    @Id
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    private ClientModel client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItemModel> itens;

}
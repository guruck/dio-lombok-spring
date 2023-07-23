package com.sample.api.demo.controller;


import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sample.api.demo.model.OrderModel;
import com.sample.api.demo.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/venda")
@AllArgsConstructor
public class VendaController {

    private final OrderRepository repository;

    @GetMapping("/list")
    public ResponseEntity<List<OrderModel>> listAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<OrderModel> save(@RequestBody @NonNull OrderModel order){
        if (order.getId() == null || order.getId().isEmpty()){
            order.setId(UUID.randomUUID().toString());
        }
        return ResponseEntity.ok(repository.save(order));
    }

}

package com.sample.api.demo.controller;


import com.sample.api.demo.model.ProductModel;
import com.sample.api.demo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @GetMapping("/list")
    public ResponseEntity<List<ProductModel>> listAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel product){
        System.out.println(product);
        return ResponseEntity.ok(repository.save(product));
    }

}

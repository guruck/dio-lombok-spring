package com.sample.api.demo.controller;

import com.sample.api.demo.model.ClientModel;
import com.sample.api.demo.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {

    private final ClientRepository repository;

    @GetMapping("/list")
    public ResponseEntity<List<ClientModel>> listAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ClientModel> save(@RequestBody ClientModel client){
        System.out.println(client);
        return ResponseEntity.ok(repository.save(client));
    }

}

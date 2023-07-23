package com.sample.api.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "cliente")
@Data
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 150)
    private String endereco;

}

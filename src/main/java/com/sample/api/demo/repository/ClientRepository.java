package com.sample.api.demo.repository;

import com.sample.api.demo.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
    ClientModel save(ClientModel client);
}

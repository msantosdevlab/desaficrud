package com.devsuperior.desaficrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desaficrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}

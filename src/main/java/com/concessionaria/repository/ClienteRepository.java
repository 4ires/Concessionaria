package com.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionaria.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
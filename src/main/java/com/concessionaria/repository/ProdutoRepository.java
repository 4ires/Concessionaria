package com.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionaria.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
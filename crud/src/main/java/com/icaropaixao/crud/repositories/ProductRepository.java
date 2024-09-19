package com.icaropaixao.crud.repositories;

import com.icaropaixao.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// metodos para entrar em contato com banco de dados     classe  / tipo
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

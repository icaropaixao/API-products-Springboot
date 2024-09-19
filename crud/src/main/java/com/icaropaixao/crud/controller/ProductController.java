package com.icaropaixao.crud.controller;

import com.icaropaixao.crud.model.Product;
import com.icaropaixao.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.icaropaixao.crud.model.Product;

// classe Controller é responsavel por receber requisições HTTP e devolver informações ao usuario

@RestController // informando que esta classe é uma classe de controle
@RequestMapping("/products") // especificando em qual parametro vai rodar os codigos
public class ProductController {

    @Autowired // instancia os objetos abaixo fazendo as injeções necessarias
    ProductRepository repository;

    @GetMapping // tipo de requisição
    public ResponseEntity getAll() {

        List <Product> listProducts = repository.findAll(); // pega todos os objetos do tipo produto

        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }

}

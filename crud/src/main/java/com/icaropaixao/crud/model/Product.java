package com.icaropaixao.crud.model;
import jakarta.persistence.*;

// especificando que toda a classe é uma classe de entidade
@Entity(name = "product")
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long price;

    // construtores
    public Product(){

    }
    public Product(Integer id, String name, Long price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // get & set
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Long getPrice(){
        return price;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Long price){
        this.price = price;
    }
}

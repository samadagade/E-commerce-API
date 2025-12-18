package com.samarth.dev.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samarth.dev.demo.Model.Product;

//JpaRepository<Product, Integer>
//Product : type of entity
//Integer : type of primary key
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}

package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,UUID> {
    
}

package com.vizmon.crudapi.repository;

import com.vizmon.crudapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}

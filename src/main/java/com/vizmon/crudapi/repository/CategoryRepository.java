package com.vizmon.crudapi.repository;

import com.vizmon.crudapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}

package com.vizmon.crudapi.service;

import com.vizmon.crudapi.model.Category;
import com.vizmon.crudapi.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    
    public Optional<Category> getCategoryById(Long id){
        return categoryRepository.findById(id);
    }
    
    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
    
    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }
    
}

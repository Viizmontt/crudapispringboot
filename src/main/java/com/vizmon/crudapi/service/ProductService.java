package com.vizmon.crudapi.service;

import com.vizmon.crudapi.model.Product;
import com.vizmon.crudapi.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    
    public void deletePrduct(Long id){
        productRepository.deleteById(id);
    }
}

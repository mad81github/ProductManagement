package com.example.babel.service;
import java.util.List;

import com.example.babel.data.Product;
import com.example.babel.repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductsByCategory(String category) {        
        return null;
    }
}

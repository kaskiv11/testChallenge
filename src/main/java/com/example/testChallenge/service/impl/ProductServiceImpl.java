package com.example.testChallenge.service.impl;

import com.example.testChallenge.model.Product;
import com.example.testChallenge.repository.ProductRepository;
import com.example.testChallenge.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ProductRepository productRepository;
    @Override
    public List<Product> allProducts(){
        return (List<Product>) productRepository.findAll();
    }
    @Override
    public void buyProduct(Long userId, Long productId) {

    }
}

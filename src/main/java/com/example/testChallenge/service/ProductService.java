package com.example.testChallenge.service;

import com.example.testChallenge.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> allProducts();

    void buyProduct(Long userId, Long productId);
}

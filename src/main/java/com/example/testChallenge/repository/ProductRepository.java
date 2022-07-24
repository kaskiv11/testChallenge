package com.example.testChallenge.repository;

import com.example.testChallenge.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
    Product findProductByFirstName(String name);
}

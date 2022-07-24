package com.example.testChallenge.controller;

import com.example.testChallenge.model.Product;
import com.example.testChallenge.model.User;
import com.example.testChallenge.service.ProductService;
import com.example.testChallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PriceController {
    @Autowired
    UserService userService;
     @Autowired
    ProductService productService;

     @GetMapping
     public List<User> allUsers(){
         return userService.allUsers();
     }
    @GetMapping
    public List<Product> allProducts(){
        return productService.allProducts();
    }
}

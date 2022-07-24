package com.example.testChallenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String firstName;
    @Column(name = "price")
    private String lastName;
    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

}

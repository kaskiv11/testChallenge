package com.example.testChallenge.service.impl;

import com.example.testChallenge.model.User;
import com.example.testChallenge.repository.UserRepository;
import com.example.testChallenge.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> allUsers(){
        return (List<User>) userRepository.findAll();
    };
}

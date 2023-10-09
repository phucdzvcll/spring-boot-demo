package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public interface UserService {
    User insertUser(User user);

    List<User> findAll();

    Optional<User> findUserById(Long id);
}

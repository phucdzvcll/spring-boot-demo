package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    public Long userId;

    private String name;

    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Bills> bills;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, String email, List<Bills> bills) {
        this.name = name;
        this.email = email;
        this.bills = bills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
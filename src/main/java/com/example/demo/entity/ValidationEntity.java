package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.;

@Entity
@GeneratedValue(strategy=G)
public ValidationEntity{
    private Long id;
    private String name;
    private String email;
    private String password;
    private Number age;

}
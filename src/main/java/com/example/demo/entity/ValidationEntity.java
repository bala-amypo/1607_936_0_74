package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
@Entity
@GeneratedValue(strategy=GenerationType.IDENTITY)
public ValidationEntity{

    private Long id;
    @NotNull
    @Size(min=2,max=6,message=)
    private String name;
    private String email;
    private String password;
    private Number age;

}
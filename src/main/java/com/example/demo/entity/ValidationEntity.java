package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity
@GeneratedValue(strategy=GenerationType.IDENTITY)
public ValidationEntity{

    private Long id;
    @NotNull
    @Size(min=2,max=6,message="require 2 to 6 characters")
    private String name;
    @Email(message="Email is not valid")
    private String email;
    @Max(6,)
    private String password;
    private Number age;

}
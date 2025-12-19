package com.example.demo.service.impl;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidationServiceImpl implements ValidationService {

    private final ValidationRepository validationRepository;

    public ValidationServiceImpl(ValidationRepository validationRepository) {
        this.validationRepository = validationRepository;
    }

    @Override
    public ValidationEntity postdata(ValidationEntity val) {
        return validationRepository.save(val);
    }

    @Override
    public ValidationEntity getData(int id) {
        return validationRepository.findById(id)
                .orElse(null); // or throw exception if preferred
    }
    @Override
    public ValidationEntity getdata(Long id){
        return value.findById(id).orElseThrow()->new Validation
    }

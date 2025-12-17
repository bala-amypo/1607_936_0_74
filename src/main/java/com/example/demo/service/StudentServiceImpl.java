package com.example.demo.service.Impl;

import org.springframework.stereotype.service;
import 


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    //save()
    //findAll()
    //findById()
    //deleteById()
    //existById();

    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);
    }


}
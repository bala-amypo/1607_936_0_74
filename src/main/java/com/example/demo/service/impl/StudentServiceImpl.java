
package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;
import org.springframework.


@Service
public class StudentServiceImpl implements StudentService{
        
    @Autowired StudentRepository student;
    // save,findAll(),findById(),deleteId(),existsById()
    @Override
    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);
    }


@Override
public List<StudentEntity> getallData(){

            return student.findAll();  

}
@Override
public String DeleteData(@PathVariable int id){
    student.deleteById(id);
    return "Deleted Successfully";
}



}
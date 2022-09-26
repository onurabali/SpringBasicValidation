package com.onurabali.springValidation.service;

import com.onurabali.springValidation.model.Student;
import com.onurabali.springValidation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Onur
 * @project springValidation
 * @Date 26.09.2022
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }
    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }
}

package com.onurabali.springValidation.controller;

import com.onurabali.springValidation.model.Student;
import com.onurabali.springValidation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Onur
 * @project springValidation
 * @Date 26.09.2022
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
        studentService.save(student);
        return ResponseEntity.ok("Student Saved");
    }
}

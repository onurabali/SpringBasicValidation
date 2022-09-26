package com.onurabali.springValidation.repository;

import com.onurabali.springValidation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Onur
 * @project springValidation
 * @Date 26.09.2022
 */

public interface StudentRepository extends JpaRepository<Student,Long> {
}

package com.onurabali.springValidation.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 * @author Onur
 * @project springValidation
 * @Date 26.09.2022
 */
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull(message = "Name can no null")
    @Size(min = 2)
    private String nameSurname;
    @NotBlank(message = "Must be not blank")
    private String schoolName;
    @Email(message = "Email should be valid")
    private String email;
    @Min(value = 18, message = "cannot be younger 18")
    private int age;
    @Pattern(regexp = "[0-9\\s]{12}")
    private String phone;
}

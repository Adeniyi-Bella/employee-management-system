package com.programming.techie.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok annotations to generate getters and setters
@Data
// Lombok annotations to generate constructor with all arguments
@AllArgsConstructor
// Lombok annotations to generate constructor with no arguments
@NoArgsConstructor
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
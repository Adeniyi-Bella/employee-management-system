package com.programming.techie.employee.entity;

import lombok.Data;
import jakarta.persistence.*;

//Persist the DB. works with JPA to save the data in DB
@Entity
//comes with getters and setters
@Data
@Table(name = "employees")
// a class that maps the data from java object to database table
public class EmployeeEntity {

    // creates a primary key for every row
    @Id
    // generate automatically incrementally
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
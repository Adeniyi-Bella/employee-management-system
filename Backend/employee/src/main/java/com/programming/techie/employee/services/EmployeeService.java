package com.programming.techie.employee.services;


import com.programming.techie.employee.model.Employee;

import java.util.List;

// import java.util.List;
// interface that contains methods to perform CRUD operations on Employee
public interface EmployeeService {
    Employee createEmployee(Employee employee);

   List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);


   /*  boolean deleteEmployee(Long id);*/


    Employee updateEmployee(Long id, Employee employee);
}
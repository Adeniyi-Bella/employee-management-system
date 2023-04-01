package com.programming.techie.employee.controller;

import com.programming.techie.employee.model.Employee;
import com.programming.techie.employee.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

// CrossOrigin annotation is used to allow requests from a different origin
@CrossOrigin(origins = "http://localhost:5173")
// RestController annotation is used to create a restful web service
@RestController
// RequestMapping annotation is used to map web requests onto specific handler methods
@RequestMapping("/api/v1/")
public class EmployeeController {
    // create an object of Employee Service
    private final EmployeeService employeeService;
    // constructor initialisation. Can also be done using @Autowired annotation or @RequiredArgsConstructor
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // a post request that accepts data from client of type model.Employee
    // and uses the employeeService class to call create employee method
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}

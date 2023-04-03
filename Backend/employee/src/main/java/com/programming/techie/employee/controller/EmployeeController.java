package com.programming.techie.employee.controller;

import com.programming.techie.employee.model.Employee;
import com.programming.techie.employee.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    // a get request that returns a list of all employees from the database

    @GetMapping("/employees")
    // return type is a list type of model.Employee
    public List<Employee> getAllEmployees() {
        // call the getAllEmployees method from the employeeService class
        return  employeeService.getAllEmployees();
    }
    // a get request that returns a single employee from the database using the id
    // pathvariable is similar to useparam hooks in react
    @GetMapping("/employees/{id}")
    // response entity is used to return a response with a status code
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = null;
        employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }
   /* public Employee getEmployeeById(@PathVariable Long id) {
        return  employeeService.getEmployeeById(id);
    }*/
    // a put request that updates an employee in the database
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,
                                                   @RequestBody Employee employee) {
        employee = employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok(employee);
    }

}

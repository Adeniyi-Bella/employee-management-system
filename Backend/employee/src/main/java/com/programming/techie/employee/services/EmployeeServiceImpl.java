package com.programming.techie.employee.services;

import com.programming.techie.employee.entity.EmployeeEntity;
import com.programming.techie.employee.model.Employee;
import com.programming.techie.employee.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // impleements the create employee method
    @Override
    public Employee createEmployee(Employee employee) {
        // to persist data in DB
        EmployeeEntity employeeEntity = new EmployeeEntity();
        // to copy to source employee and destination employee entity
        BeanUtils.copyProperties(employee, employeeEntity);
        // persisting data in DB
        employeeRepository.save(employeeEntity);
        return employee;
    }
    // overides the interface method
    // called from the controller class to get all employees
    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeEntity> employeeEntities
                = employeeRepository.findAll();

        List<Employee> employees = employeeEntities
                .stream()
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmailId()))
                .collect(Collectors.toList());
        return employees;
    }

    // gets a single employee from the database using the id
    @Override
    public Employee getEmployeeById(Long id) {
        EmployeeEntity employeeEntity
                = employeeRepository.findById(id).get();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }

    @Override
    // updates an employee in the database
    public Employee updateEmployee(Long id, Employee employee) {
        EmployeeEntity employeeEntity
                = employeeRepository.findById(id).get();
        employeeEntity.setEmailId(employee.getEmailId());
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());

        employeeRepository.save(employeeEntity);
        return employee;
    }
}

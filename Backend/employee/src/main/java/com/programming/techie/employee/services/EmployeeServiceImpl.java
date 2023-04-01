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
}

package com.programming.techie.employee.repository;

import com.programming.techie.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
// interface that extends JpaRepository to perform CRUD operations on EmployeeEntity
// JpaRepository is a generic interface that takes two parameters: the entity class and the primary key type
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
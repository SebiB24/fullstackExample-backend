package org.example.fullstackexample.repo;

import org.example.fullstackexample.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    /// SPRING QUERY METHODS:
    /// spring understands how to implement the methods based on the name !!!
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(long id); // Optional -> it doesnt always return the employee
}

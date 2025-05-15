package org.example.fullstackexample.repo;

import org.example.fullstackexample.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}

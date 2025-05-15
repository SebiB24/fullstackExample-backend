package org.example.fullstackexample.service;

import org.example.fullstackexample.domain.Employee;
import org.example.fullstackexample.exception.UserNotFoundException;
import org.example.fullstackexample.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class EmplyeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmplyeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
//        return employeeRepo.findById(id).get();
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id) {
//        employeeRepo.deleteById(id);
        employeeRepo.deleteEmployeeById(id);//using the query implementation
    }
}

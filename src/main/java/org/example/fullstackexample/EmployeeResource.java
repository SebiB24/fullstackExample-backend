package org.example.fullstackexample;

import org.example.fullstackexample.domain.Employee;
import org.example.fullstackexample.service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    private final EmplyeeService emplyeeService;

    @Autowired
    public EmployeeResource(EmplyeeService emplyeeService) {
        this.emplyeeService = emplyeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = emplyeeService.findAllEmployees();
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = emplyeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = emplyeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updatedEmployee = emplyeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
        emplyeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

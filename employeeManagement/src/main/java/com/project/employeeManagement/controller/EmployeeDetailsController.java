package com.project.employeeManagement.controller;

import com.project.employeeManagement.model.EmployeeDetails;
import com.project.employeeManagement.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeDetailsController {
    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @PostMapping("/postEmployee")
    public ResponseEntity<EmployeeDetails> createEmployee(@RequestBody EmployeeDetails employee) {
        EmployeeDetails created = employeeDetailsService.createEmployee(employee);
        return new ResponseEntity<>(created,HttpStatus.OK);
    }

    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<EmployeeDetails>> getAllEmployees() {
        return new ResponseEntity<>(employeeDetailsService.getAllEmployees(),HttpStatus.OK);
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<EmployeeDetails> getEmployeeById(@PathVariable int id) {
        return new ResponseEntity<>((employeeDetailsService.getEmployeeById(id)),HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<EmployeeDetails> updateEmployee(
            @PathVariable int id,
            @RequestBody EmployeeDetails employee) {
        return new ResponseEntity<>(employeeDetailsService.updateEmployee(id, employee),HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id) {
        employeeDetailsService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

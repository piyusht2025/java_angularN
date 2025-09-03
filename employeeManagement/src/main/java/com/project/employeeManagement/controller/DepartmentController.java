package com.project.employeeManagement.controller;

import com.project.employeeManagement.model.Department;
import com.project.employeeManagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/getDepartment")
    public ResponseEntity<List<Department>> getDepartment(){
        return new ResponseEntity<>(departmentService.getDepartment(), HttpStatus.OK);
    }

    @GetMapping("/getDepartment/{id}")
    public ResponseEntity<Optional<Department>> getDepartment(@PathVariable int id){
        return new ResponseEntity<>(departmentService.getDepartment(id), HttpStatus.OK);
    }
    @PostMapping("/postDepartment")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.createDepartment(department),HttpStatus.OK);
    }

    @PutMapping("/updateDepartment/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable int id , @RequestBody Department name){
        return new ResponseEntity<>(departmentService.updateDepartment(id,name),HttpStatus.OK);

    }

    @DeleteMapping("/deleteDepartment/{id}")
    public ResponseEntity<HttpStatusCode> deleteDepartment(@PathVariable int id){
        departmentService.deleteDepartment(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}

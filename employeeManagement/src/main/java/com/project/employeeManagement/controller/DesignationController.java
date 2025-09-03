package com.project.employeeManagement.controller;

import com.project.employeeManagement.model.Designation;
import com.project.employeeManagement.model.Designation;
import com.project.employeeManagement.service.DesignationService;
import com.project.employeeManagement.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class DesignationController {
    @Autowired
    DesignationService designationService;
    @GetMapping("/getDesignation")
    public ResponseEntity<List<Designation>> getDesignation(){
        return new ResponseEntity<>(designationService.getDesignation(), HttpStatus.OK);
    }

    @GetMapping("/getDesignation/{id}")
    public ResponseEntity<Optional<Designation>> getDesignation(@PathVariable int id){
        return new ResponseEntity<>(designationService.getDesignation(id), HttpStatus.OK);
    }
    @PostMapping("/postDesignation")
    public ResponseEntity<Designation> createDesignation(@RequestBody Designation designation){
        return new ResponseEntity<>(designationService.createDesignation(designation),HttpStatus.OK);
    }

    @PutMapping("/updateDesignation/{id}")
    public ResponseEntity<Designation> updateDesignation(@PathVariable int id , @RequestBody Designation name){
        return new ResponseEntity<>(designationService.updateDesignation(id,name),HttpStatus.OK);

    }

    @DeleteMapping("/deleteDesignation/{id}")
    public ResponseEntity<HttpStatusCode> deleteDesignation(@PathVariable int id){
        designationService.deleteDesignation(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}

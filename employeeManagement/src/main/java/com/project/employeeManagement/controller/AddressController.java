package com.project.employeeManagement.controller;

import com.project.employeeManagement.model.Address;
import com.project.employeeManagement.model.EmployeeDetails;
import com.project.employeeManagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/getAllAddress")
    public ResponseEntity<List<Address>> getAllAddress(){
        return new ResponseEntity<>(addressService.getAllAddresses(), HttpStatus.OK);
    }
    @GetMapping("/getAddressById/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable int id ){
        return new ResponseEntity<>(addressService.getAddressById(id), HttpStatus.OK);
    }

    @GetMapping("/getEmployeeByAddressId/{id}")
    public ResponseEntity<List<EmployeeDetails>> getEmployeesByAddressId(@PathVariable int id ){
        return new ResponseEntity<>(addressService.getEmployeesByAddressId(id),HttpStatus.OK);
    }

    @PostMapping("/postAddress")
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        return new ResponseEntity<>(addressService.createAddress(address),HttpStatus.OK);
    }
}

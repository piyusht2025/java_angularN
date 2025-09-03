package com.project.employeeManagement.service;

import com.project.employeeManagement.model.Address;
import com.project.employeeManagement.model.EmployeeDetails;
import com.project.employeeManagement.repository.AddressRepo;
import com.project.employeeManagement.repository.EmployeeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private EmployeeDetailsRepo employeeDetailsRepo;

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    public Address getAddressById(int id) {
        return addressRepo.findById(id).orElse(null);
    }

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Address updateAddress(int id, Address updatedAddress) {

        Address existingAddress = getAddressById(id);
        existingAddress.setAddressDetails(updatedAddress.getAddressDetails());
        return addressRepo.save(existingAddress);

    }

    public List<EmployeeDetails> getEmployeesByAddressId(int id) {
        Address address = getAddressById(id);
        List<EmployeeDetails> employees = employeeDetailsRepo.findAll();

        return employees.stream().filter(emp -> emp.getAddresses().contains(address)).toList();
    }

}
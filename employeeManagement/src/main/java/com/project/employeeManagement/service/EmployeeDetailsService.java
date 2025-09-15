package com.project.employeeManagement.service;

import com.project.employeeManagement.dto.*;
import com.project.employeeManagement.model.*;
import com.project.employeeManagement.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeDetailsService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EmployeeDetailsRepo employeeDetailsRepo;
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private DesignationRepo designationRepo;
    @Autowired
    private BankAccountRepo bankAccountRepo;
    @Autowired
    private AddressRepo addressRepo;
    public EmployeeDetails createEmployee(EmployeeDetails employee) {
        if (employee.getDepartment() != null && employee.getDepartment().getId() > 0) {
            Department dept = departmentRepo.findById(employee.getDepartment().getId()).orElse(null);
            employee.setDepartment(dept);
        }

        if (employee.getDesignation() != null && employee.getDesignation().getId() > 0) {
            Designation desig = designationRepo.findById(employee.getDesignation().getId()).orElse(null);
            employee.setDesignation(desig);
        }

        List<Address> resolvedAddresses = new ArrayList<>();
        if (employee.getAddresses() != null) {
            for (Address addr : employee.getAddresses()) {
                if (addr.getId() > 0) {
                    Address existing = addressRepo.findById(addr.getId()).orElse(null);
                    resolvedAddresses.add(existing);
                }
                else {
                    Address existing = addressRepo.findByAddressDetails(addr.getAddressDetails()).orElse(null);
                    if (existing != null) {
                        resolvedAddresses.add(existing);
                    } else {
                        resolvedAddresses.add(addressRepo.save(addr)); // create only if really new
                    }
                }
            }
        }
        employee.setAddresses(resolvedAddresses);
        EmployeeDetails savedEmployee = employeeDetailsRepo.save(employee);


        if (employee.getBankAccounts() != null) {
            for (BankAccount acc : employee.getBankAccounts()) {
                acc.setEmployeeDetails(savedEmployee);
                bankAccountRepo.save(acc);
            }
        }
        return savedEmployee;
    }
    public List<EmployeeDetails> getAllEmployees() {
        return employeeDetailsRepo.findAll();
    }

    public EmployeeDetails getEmployeeById(int id) {
        return employeeDetailsRepo.findById(id)
                .orElse(null);
    }

    public EmployeeDetails updateEmployee(int id, EmployeeDetails updatedEmployee) {
        EmployeeDetails existing = getEmployeeById(id);
        existing.setName(updatedEmployee.getName());
        existing.setActive(updatedEmployee.isActive());
        if (updatedEmployee.getDepartment() != null && updatedEmployee.getDepartment().getId() > 0) {
            Department dept = departmentRepo.findById(updatedEmployee.getDepartment().getId()).orElse(null);
            existing.setDepartment(dept);
        }
        if (updatedEmployee.getDesignation() != null && updatedEmployee.getDesignation().getId() > 0) {
            Designation desig = designationRepo.findById(updatedEmployee.getDesignation().getId()).orElse(null);
            existing.setDesignation(desig);
        }
        List<Address> resolvedAddresses = new ArrayList<>();
        if (updatedEmployee.getAddresses() != null) {
            for (Address addr : updatedEmployee.getAddresses()) {
                if (addr.getId() > 0) {
                    Address existingAddr = addressRepo.findById(addr.getId()).orElse(null);
                    resolvedAddresses.add(existingAddr);
                } else {
                    resolvedAddresses.add(addressRepo.save(addr));
                }
            }
        }
        existing.setAddresses(resolvedAddresses);

        if (updatedEmployee.getBankAccounts() != null) {

            if (existing.getBankAccounts() != null) {
                for (BankAccount acc : existing.getBankAccounts()) {
                    bankAccountRepo.delete(acc);
                }
            }

            for (BankAccount acc : updatedEmployee.getBankAccounts()) {
                acc.setEmployeeDetails(existing);
                bankAccountRepo.save(acc);
            }
        }
        return employeeDetailsRepo.save(existing);
    }

    public void deleteEmployee(int id) {
        EmployeeDetails emp = getEmployeeById(id);

        if (emp.getBankAccounts() != null) {
            for (BankAccount acc : emp.getBankAccounts()) {
                bankAccountRepo.delete(acc);
            }
        }

        if (emp.getAddresses() != null) {
            for (Address addr : emp.getAddresses()) {
                List<EmployeeDetails> linkedEmployees = addr.getEmployees();
                if (linkedEmployees == null || linkedEmployees.size() <= 1) {
                    addressRepo.delete(addr);
                }
            }
        }
        employeeDetailsRepo.delete(emp);
    }

    public ViewEmployeeResponsDto fetchEmployee(int id) {
        EmployeeDetails employeeDetails = employeeDetailsRepo.findById(id).orElseThrow(RuntimeException::new);
        ViewEmployeeResponsDto viewEmployeeResponsDto= modelMapper.map(employeeDetails, ViewEmployeeResponsDto.class);
        DepartmentDto deptName=modelMapper.map(employeeDetails.getDepartment(), DepartmentDto.class);
        DesignationDto designName=modelMapper.map(employeeDetails.getDesignation(), DesignationDto.class);
        viewEmployeeResponsDto.setDepartment(deptName.getName());
        viewEmployeeResponsDto.setDesignation(designName.getName());
        List<BankAccountDto> accountDtos= employeeDetails.getBankAccounts()
                .stream()
                .map(account ->modelMapper.map(account, BankAccountDto.class) )
                .toList();
        List<AddressDto> addressDtos= employeeDetails.getAddresses()
                .stream()
                .map(address ->modelMapper.map(address, AddressDto.class) )
                .toList();
        viewEmployeeResponsDto.setBankAccounts(accountDtos);
        viewEmployeeResponsDto.setAddresses(addressDtos);
        return viewEmployeeResponsDto;
    }

    public List<EmployeeDetailsDto> fetchAllEmployee(){
        List<EmployeeDetails> employeeDetails = employeeDetailsRepo.findAll();
        return employeeDetails.stream()
                .map(emp->modelMapper.map(emp,EmployeeDetailsDto.class)).toList();
    }
}
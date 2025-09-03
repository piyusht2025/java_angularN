package com.project.employeeManagement.service;

import com.project.employeeManagement.model.Designation;
import com.project.employeeManagement.model.Designation;
import com.project.employeeManagement.model.Designation;
import com.project.employeeManagement.model.EmployeeDetails;
import com.project.employeeManagement.repository.DesignationRepo;
import com.project.employeeManagement.repository.EmployeeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {

    @Autowired
    DesignationRepo designationRepo;

    @Autowired
    EmployeeDetailsRepo employeeDetailsRepo;

    public List<Designation> getDesignation() {
        return designationRepo.findAll();
    }

    public Optional<Designation> getDesignation(int id) {
        return designationRepo.findById(id);
    }

    public Designation createDesignation(Designation designation) {
        return designationRepo.save(designation);
    }

    public void deleteDesignation(int id) {
        Designation dept=designationRepo.findById(id).orElse(null);

        List<EmployeeDetails> employees =employeeDetailsRepo.findByDesignation(dept);

        for (EmployeeDetails emp:employees){
            emp.setActive(false);
        }
        employeeDetailsRepo.saveAll(employees);
        designationRepo.deleteById(id);
    }

    public Designation updateDesignation(int id,Designation dept) {
        String name=dept.getName();
        Designation designation=designationRepo.findById(id).orElse(null);
        if(designation!=null){
            designation.setName(name);
            designationRepo.save(designation);
            return designation;
        }
        return new Designation();
    }
}

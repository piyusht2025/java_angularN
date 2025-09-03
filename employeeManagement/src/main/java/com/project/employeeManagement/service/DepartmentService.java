package com.project.employeeManagement.service;

import com.project.employeeManagement.model.Department;
import com.project.employeeManagement.model.EmployeeDetails;
import com.project.employeeManagement.repository.DepartmentRepo;
import com.project.employeeManagement.repository.EmployeeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private EmployeeDetailsRepo employeeDetailsRepo;

    public List<Department> getDepartment() {
        return departmentRepo.findAll();
    }

    public Optional<Department> getDepartment(int id) {
        return departmentRepo.findById(id);
    }

    public Department createDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public void deleteDepartment(int id) {
        Department dept=departmentRepo.findById(id).orElse(null);

        List<EmployeeDetails> employees =employeeDetailsRepo.findByDepartment(dept);

        for (EmployeeDetails emp:employees){
            emp.setActive(false);
        }
        employeeDetailsRepo.saveAll(employees);
        departmentRepo.deleteById(id);
    }

    public Department updateDepartment(int id,Department dept) {
        String name=dept.getName();
        Department department=departmentRepo.findById(id).orElse(null);
        if(department!=null){
            department.setName(name);
            departmentRepo.save(department);
            return department;
        }
        return new Department();
    }
}

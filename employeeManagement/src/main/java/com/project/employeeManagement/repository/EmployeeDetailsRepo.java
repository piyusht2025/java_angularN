package com.project.employeeManagement.repository;

import com.project.employeeManagement.model.Department;
import com.project.employeeManagement.model.Designation;
import com.project.employeeManagement.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails,Integer> {
    List<EmployeeDetails> findByDepartment(Department department);
    List<EmployeeDetails> findByDesignation(Designation designation);

}

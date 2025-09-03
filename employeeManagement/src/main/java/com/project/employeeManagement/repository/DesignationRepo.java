package com.project.employeeManagement.repository;

import com.project.employeeManagement.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepo extends JpaRepository<Designation,Integer> {
}

package com.project.employeeManagement.repository;

import com.project.employeeManagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {
    @Override
    Optional<Department> findById(Integer integer);

    @Override
    List<Department> findAll();

    @Override
    void deleteById(Integer integer);
}

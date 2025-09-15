package com.project.employeeManagement.repository;

import com.project.employeeManagement.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DesignationRepo extends JpaRepository<Designation,Integer> {
    @Override
    Optional<Designation> findById(Integer integer);

    @Override
    List<Designation> findAll();

    @Override
    void deleteById(Integer integer);


}

package com.project.employeeManagement.repository;

import com.project.employeeManagement.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount,Integer> {
    @Override
    List<BankAccount> findAll();

    @Override
    Optional<BankAccount> findById(Integer integer);
}

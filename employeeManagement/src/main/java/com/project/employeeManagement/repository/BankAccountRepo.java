package com.project.employeeManagement.repository;

import com.project.employeeManagement.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount,Integer> {
}

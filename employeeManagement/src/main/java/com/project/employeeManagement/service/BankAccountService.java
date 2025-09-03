package com.project.employeeManagement.service;

import com.project.employeeManagement.model.BankAccount;
import com.project.employeeManagement.repository.BankAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {
    @Autowired
    private BankAccountRepo bankAccountRepo;

    public BankAccount createBankAccount(BankAccount bankAccount) {
        return bankAccountRepo.save(bankAccount);
    }

    public List<BankAccount> getAllBankAccounts() {
        return bankAccountRepo.findAll();
    }

    public BankAccount getBankAccountById(int id) {
        return bankAccountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Bank Account not found with id: " + id));
    }
}
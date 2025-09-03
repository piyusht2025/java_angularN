package com.project.employeeManagement.controller;

import com.project.employeeManagement.model.BankAccount;
import com.project.employeeManagement.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;
    @PostMapping("/postBankAccount")
    public ResponseEntity<BankAccount> createBankAccount(@RequestBody BankAccount bankAccount) {
        BankAccount saved = bankAccountService.createBankAccount(bankAccount);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/getAllBankAccounts")
    public ResponseEntity<List<BankAccount>> getAllBankAccounts() {
        return ResponseEntity.ok(bankAccountService.getAllBankAccounts());
    }

    @GetMapping("/getBankAccountById/{id}")
    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable int id) {
        return ResponseEntity.ok(bankAccountService.getBankAccountById(id));
    }
}
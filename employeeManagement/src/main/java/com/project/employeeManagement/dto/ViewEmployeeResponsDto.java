package com.project.employeeManagement.dto;

import com.project.employeeManagement.model.BankAccount;
import lombok.Data;

import java.util.List;

@Data
public class ViewEmployeeResponsDto {

    private String name;
    private String designation;
    private String department;
    private List<BankAccountDto> bankAccounts;
    private List<AddressDto> addresses;
}

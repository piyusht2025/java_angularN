package com.project.employeeManagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "employee_details")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "dept_id", referencedColumnName = "id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "design_id", referencedColumnName = "id")
    private Designation designation;

    @Column(name="active" )
    private boolean active;

    public EmployeeDetails(){
        this.active=true;
    }

    @OneToMany(mappedBy = "employeeDetails")
    private List<BankAccount> bankAccounts;

    @ManyToMany
    @JoinTable(
            name = "emp_address",
            joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id")
    )

    private List<Address> addresses;

}
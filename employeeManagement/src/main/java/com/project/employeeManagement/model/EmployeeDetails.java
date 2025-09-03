package com.project.employeeManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Jacksonized
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

    @Column(name="active")
    private boolean active=true;

    @OneToMany(mappedBy = "employeeDetails")
    @JsonIgnore
    private List<BankAccount> bankAccounts;

    @ManyToMany
    @JoinTable(
            name = "emp_address",
            joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id")
    )
    @JsonIgnore
    private List<Address> addresses;

}

package com.project.employeeManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address_detail")
    private String addressDetails;

    @ManyToMany(mappedBy = "addresses",cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<EmployeeDetails> employees;
}

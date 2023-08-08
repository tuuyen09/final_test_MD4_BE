package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeCode;
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee() {
    }

    public Employee(Long id, String employeeCode, String name, int age, double salary, String department) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}

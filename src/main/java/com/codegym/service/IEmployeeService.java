package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(Long id);
    void save(Employee employee);
    void deleteById(Long id);
}

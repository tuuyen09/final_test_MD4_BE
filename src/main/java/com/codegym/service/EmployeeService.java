package com.codegym.service;

import com.codegym.model.Employee;
import com.codegym.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepo.deleteById(id);
    }
}

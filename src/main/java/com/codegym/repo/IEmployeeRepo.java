package com.codegym.repo;

import com.codegym.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
}

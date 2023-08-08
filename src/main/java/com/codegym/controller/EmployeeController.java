package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/show")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }
    @PostMapping("/edit/{id}")
    public ResponseEntity<Employee> editEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        employeeService.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteById(id);
    }
}

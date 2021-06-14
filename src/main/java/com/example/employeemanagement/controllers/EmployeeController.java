package com.example.employeemanagement.controllers;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return this.employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> findAllEmployee(){
        return this.employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee findEmployee(@PathVariable("id") String id){
        return this.employeeService.findEmployee(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") String id){
        this.employeeService.deleteEmployee(id);
    }

}

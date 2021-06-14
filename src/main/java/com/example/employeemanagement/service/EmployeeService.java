package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployee();

    Employee saveEmployee(Employee employee);

    Employee findEmployee(String id);

    void deleteEmployee(String id);
}

package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee findEmployee(String id);

    void deleteEmployee(String id);
}

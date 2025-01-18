package com.curd.service;

import com.curd.entity.Employee;

import java.util.List;

public interface EmployeeService {
 Employee createEmployee(Employee employee);
 Employee getEmployeeById(long id);
 List<Employee> getAllEmployees();
// Employee updateEmployee(Long id, Employee employeeDetails);
 void deleteEmployee(Long id);
}

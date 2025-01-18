package com.curd.service;

import com.curd.entity.Employee;
import org.springframework.stereotype.Service;
import com.curd.repo.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee Not Found"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        // Check if the repository is returning data correctly
        List<Employee> employees = employeeRepository.findAll();
        System.out.println("Fetched Employees: " + employees);  // Debugging
        return employees;
    }

//    @Override
//    public Employee updateEmployee(Long id, Employee employeeDetails) {
//        Employee emp = getEmployeeById(id);
//        emp.setFirstName(employeeDetails.getFirstName());
//        emp.setLastname(employeeDetails.getLastname());
//        emp.setCity(employeeDetails.getCity());
//        emp.setEmail(employeeDetails.getEmail());
//        emp.setAddress(employeeDetails.getAddress());
//        emp.setDepertment(employeeDetails.getDepertmen());
//        emp.setPhone(employeeDetails.getPhone());
//        emp.setSalary(employeeDetails.getSalary());
//        emp.setState(employeeDetails.getState());
//        emp.setPosition(employeeDetails.getPosition());
//        emp.setZipCode(employeeDetails.getZipCode());
//        return employeeRepository.save(emp);
//    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
}

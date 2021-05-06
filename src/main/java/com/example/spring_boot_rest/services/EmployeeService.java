package com.example.spring_boot_rest.services;



import com.example.spring_boot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployee(int id) ;


    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
package com.example.spring_boot_rest.dao;


import com.example.spring_boot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    public   Employee getEmployee(int id);

    void deleteEmployee(int id);
}
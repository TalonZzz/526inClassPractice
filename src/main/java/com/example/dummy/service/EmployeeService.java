package com.example.dummy.service;

import com.example.dummy.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getGreaterAge(Integer age);
    public List<Employee> groupByAge();
}

package com.example.dummy.repository;

import com.example.dummy.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    public List<Employee> getGreaterAge(Integer age);
    public List<Employee> groupByAge();
}

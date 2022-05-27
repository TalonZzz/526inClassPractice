package com.example.dummy.service;

import com.example.dummy.domain.Employee;

import java.util.List;

public interface service {

    public List<Employee> FindAgeGreaterThan(int age, List<Employee> employeeList);

}

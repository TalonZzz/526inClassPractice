package com.example.dummy.service;

import com.example.dummy.domain.Employee;
import com.example.dummy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getGreaterAge(Integer age) {
        return employeeRepository.getGreaterAge(age);
    }

    @Override
    public List<Employee> groupByAge() {
        return employeeRepository.groupByAge();
    }
}

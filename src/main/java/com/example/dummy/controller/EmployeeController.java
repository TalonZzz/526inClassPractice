package com.example.dummy.controller;


import com.example.dummy.domain.Employee;
import com.example.dummy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/getAgeGreaterThan{age}")
    public ResponseEntity<List<Employee>> getAgeGreaterThan(@PathVariable Integer age){
        return new ResponseEntity<>(employeeService.getGreaterAge(age), HttpStatus.OK);
    }

    @GetMapping("/employees/groupByAge")
    public ResponseEntity<List<Employee>> api2(){
        return new ResponseEntity<>(employeeService.groupByAge(),HttpStatus.OK);
    }
}

package com.example.dummy.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "employee")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name="employee_salary")
    private int employee_salary;

    @Column(name="employee_age")
    private Integer age;

    @Column(name = "profile_image")
    private String profile_image;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                ", age=" + age +
                ", profile_image='" + profile_image + '\'' +
                '}';
    }
}

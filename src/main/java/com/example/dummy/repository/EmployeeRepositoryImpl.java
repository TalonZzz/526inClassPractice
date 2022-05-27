package com.example.dummy.repository;

import com.example.dummy.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private EntityManager em;

    @Autowired
    public EmployeeRepositoryImpl(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    public List<Employee> getGreaterAge(Integer age) {
        return em.createQuery("FROM Employee where employee_age > :lowerbound").setParameter("lowerbound",age).getResultList();



    }

    @Override
    public List<Employee> groupByAge() {
        return em.createQuery("FROM Employee GROUP BY employee_age ORDER BY employee_age DESC").getResultList();
    }
}

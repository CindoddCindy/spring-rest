package io.vxv.repository;

import io.vxv.entity.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Priyanka C", "cp18@gmail.com", 1000));
        employees.add(new Employee("John Grant", "jgrant@gmail.com", 2000));
        return employees;
    }

    @Override
    public Employee findOne(String id) {
        return new Employee("Priyanka C", "cp18@gmail.com", 1000);
    }
}

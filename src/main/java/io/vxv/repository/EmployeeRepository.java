package io.vxv.repository;

import io.vxv.entity.Employee;
import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee findOne(String id);

}

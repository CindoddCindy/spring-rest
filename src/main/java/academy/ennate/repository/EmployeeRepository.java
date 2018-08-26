package academy.ennate.repository;


import academy.ennate.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee findOne(String id);

}


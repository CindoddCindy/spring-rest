package academy.ennate.service;

import academy.ennate.entity.Employee;
import academy.ennate.exception.EmployeeNotFoundException;
import academy.ennate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {

        return repository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        Employee emp = repository.findOne(id);
        if(emp == null){
            throw new EmployeeNotFoundException("Employee with id: " + id + "not found");
        } else {
            return emp;
        }
    }

    @Override
    public Employee create(Employee emp) {
        return null;
    }

    @Override
    public Employee update(String id, Employee emp) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

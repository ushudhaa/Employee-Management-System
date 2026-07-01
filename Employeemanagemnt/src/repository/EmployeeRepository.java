package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<Employee> employees =
            new ArrayList<>();


    public void save(
            Employee employee
    ) {

        employees.add(employee);

    }


    public List<Employee> findAll() {

        return employees;

    }

}
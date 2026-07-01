package service;

import model.Employee;

public interface EmployeeService {

    void add(
            Employee employee
    );

    void display();

    Employee findById(
            int id
    );

    void remove(
            int id
    );

    void updateSalary(
            int id,
            double salary
    );

}
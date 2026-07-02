package service;

import model.Employee;

public interface EmployeeService {

    void add(
            Employee employee
    );
    void updateSalary(
            int id,
            double salary
    );
    void search(int id);

    void display();

    Employee findById(
            int id
    );

    void remove(
            int id
    );



}
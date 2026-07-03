package service;

import model.Employee;

public interface EmployeeService {

    void addEmployee(
            );


    void updateSalary(int id, double salary);

    void search(int id);

    void display();

    Employee findById(int id);

    void remove(int id);

    void viewEmployees();

    void deleteEmployee();

    void searchEmployee();

    void updateSalary(int id);

    void updateSalary();
}
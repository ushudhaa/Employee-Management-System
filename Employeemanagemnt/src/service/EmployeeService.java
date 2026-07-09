package service;

import model.Employee;

public interface EmployeeService {

    void addEmployee();

    void viewEmployees();

    void searchEmployee();

    void updateSalary();

    void deleteEmployee();

    Employee findById(int id);
}
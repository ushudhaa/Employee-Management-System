package service;

import model.Employee;

public interface EmployeeService {

    void addEmployee();

    void viewEmployees();

    void searchEmployee();

    void deleteEmployee();

    void updateSalary();

    Employee findById(int id);
}
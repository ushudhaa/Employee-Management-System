package serviceImpl;

import model.Employee;
import model.Staff;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private List<Staff> employees;

    public EmployeeServiceImpl(List<Staff> employees) {
        this.employees = employees;
    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void updateSalary(int id, double salary) {

    }

    @Override
    public void search(int id) {

    }

    @Override
    public void display() {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void viewEmployees() {

    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public void searchEmployee() {

    }

    @Override
    public void updateSalary(int id) {

    }

    @Override
    public void updateSalary() {

    }
}
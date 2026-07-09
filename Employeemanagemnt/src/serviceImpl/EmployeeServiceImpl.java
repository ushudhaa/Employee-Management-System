package serviceImpl;

import model.Employee;
import model.Staff;
import service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private List<Staff> employees;
    private Scanner sc = new Scanner(System.in);

    public EmployeeServiceImpl(List<Staff> employees) {
        this.employees = employees;
    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void viewEmployees() {

    }

    @Override
    public void searchEmployee() {

    }

    @Override
    public void updateSalary() {

    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }
}
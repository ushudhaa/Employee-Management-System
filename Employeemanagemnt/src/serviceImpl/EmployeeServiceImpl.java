package serviceImpl;

import model.Employee;
import model.Staff;
import service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private final List<Staff> employees;
    private final Scanner sc = new Scanner(System.in);

    public EmployeeServiceImpl(List<Staff> employees) {
        this.employees = employees;
    }

    @Override
    public void addEmployee() {

        System.out.println("\n========== ADD EMPLOYEE ==========");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Shift (Day/Night): ");
        String shift = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Working Hours: ");
        int workingHours = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Staff employee = new Staff(
                id,
                name,
                address,
                age,
                shift,
                department,
                workingHours,
                salary
        );

        employees.add(employee);

        System.out.println("\nEmployee added successfully!");
    }

    @Override
    public void viewEmployees() {
        employees.forEach(System.out::println);
    }

    @Override
    public void searchEmployee() {
        System.out.println("Search Employee - Not Implemented");
    }

    @Override
    public void updateSalary() {
        System.out.println("Update Salary - Not Implemented");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Delete Employee - Not Implemented");
    }

    // ----- Existing interface methods -----

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
    public void updateSalary(int id) {

    }
}
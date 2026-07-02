import model.Staff;
import util.DataSeeder;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Staff> employees = DataSeeder.loadStaff();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("""
===== EMPLOYEE MANAGEMENT =====

1. Add Employee
2. View Employees
3. Search Employee
4. Update Salary
5. Delete Employee
6. Attendance
7. Payroll
8. Reports
9. Exit
""");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Employee");
                    break;

                case 2:
                    System.out.println("View Employees");

                    employees.forEach(System.out::println);

                    break;

                case 3:
                    System.out.println("Search Employee");
                    break;

                case 4:
                    System.out.println("Update Salary");
                    break;

                case 5:
                    System.out.println("Delete Employee");
                    break;

                case 6:
                    System.out.println("Attendance");
                    break;

                case 7:
                    System.out.println("Payroll");
                    break;

                case 8:
                    System.out.println("Reports");

                    employees.stream()
                            .filter(e -> e.getShift().equals("Day"))
                            .forEach(e -> System.out.println(e.getName()));

                    employees.stream()
                            .filter(e -> e.getSalary() >= 50000)
                            .forEach(System.out::println);

                    long count = employees.stream()
                            .filter(e -> e.getShift().equals("Night"))
                            .count();

                    System.out.println("Night Shift Count = " + count);

                    employees.stream()
                            .filter(e -> e.getDepartment().equals("HR"))
                            .map(Staff::getName)
                            .forEach(System.out::println);

                    employees.stream()
                            .map(e -> e.getName().toUpperCase())
                            .forEach(System.out::println);

                    employees.stream()
                            .sorted(Comparator.comparing(Staff::getSalary).reversed())
                            .forEach(e -> System.out.println(e.getSalary()));

                    break;

                case 9:
                    System.out.println("Thank you!");
                    sc.close();
                    return; // exits main()

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
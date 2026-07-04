import model.Staff;
import service.EmployeeService;
import serviceImpl.EmployeeServiceImpl;
import util.DataSeeder;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Staff> employees = DataSeeder.loadStaff();
        Scanner sc = new Scanner(System.in);

        EmployeeService employeeService = new EmployeeServiceImpl(employees);

        while (true) {

            System.out.println("""
 EMPLOYEE MANAGEMENT

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
                    employeeService.addEmployee();
                    break;

                case 2:
                    employeeService.viewEmployees();
                    break;

                case 3:
                    employeeService.searchEmployee();
                    break;

                case 4:
                    employeeService.updateSalary();
                    break;

                case 5:
                    employeeService.deleteEmployee();
                    break;

                case 6:
                    System.out.println("Attendance Module");
                    break;

                case 7:
                    System.out.println("Payroll Module");
                    break;

                case 8:
                    System.out.println("Reports Module");
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
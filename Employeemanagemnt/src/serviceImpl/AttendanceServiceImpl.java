package serviceImpl;

import model.Attendance;
import model.Staff;
import service.AttendanceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceServiceImpl implements AttendanceService {

    private List<Staff> employees;
    private List<Attendance> attendanceList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public AttendanceServiceImpl(List<Staff> employees) {
        this.employees = employees;
    }

    @Override
    public void markAttendance() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Staff foundEmployee = null;

        for (Staff employee : employees) {
            if (employee.getID() == id) {
                foundEmployee = employee;
                break;
            }
        }

        if (foundEmployee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("""
                1. Present
                2. Absent
                3. Leave
                """);

        System.out.print("Choose Status: ");
        int choice = sc.nextInt();


    }

    @Override
    public void viewAttendance() {

        for (Attendance attendance : attendanceList) {
            System.out.println(attendance);
        }
    }
}
package serviceImpl;

import model.Attendance;
import model.AttendanceStatus;
import model.Staff;
import service.AttendanceService;

import javax.print.attribute.standard.PresentationDirection;
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

        AttendanceStatus status=null;
        switch (choice){
            case 1:
                AttendanceStatus Status = AttendanceStatus.Present;
                        break;
            case 2:
                AttendanceStatus status1=AttendanceStatus.Absent;
                break;
            case 3:
                AttendanceStatus Status2 = AttendanceStatus.Leave;
                break;
            case 4:
                AttendanceStatus Status3= AttendanceStatus.Half_day;
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    @Override
    public void viewAttendance() {

        for (Attendance attendance : attendanceList) {
            System.out.println(attendance);
        }
    }
}
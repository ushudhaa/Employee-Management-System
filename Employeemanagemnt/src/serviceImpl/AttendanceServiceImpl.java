package serviceImpl;

import model.Attendance;
import model.Staff;
import service.AttendanceService;

import java.util.List;
import java.util.Scanner;

public class AttendanceServiceImpl implements AttendanceService {

    private final List<Staff> employees;
    private final List<Attendance> attendanceList;
    private final Scanner sc = new Scanner(System.in);

    public AttendanceServiceImpl(List<Staff> employees,
                                 List<Attendance> attendanceList) {
        this.employees = employees;
        this.attendanceList = attendanceList;
    }

    @Override
    public void markAttendance() {

    }

    @Override
    public void viewAttendance() {

    }
}
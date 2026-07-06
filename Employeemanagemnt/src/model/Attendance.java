package model;

import java.time.LocalDate;

public class Attendance {

    private int employeeId;
    private LocalDate date;
    private AttendanceStatus status;

    public Attendance(int employeeId, AttendanceStatus status) {
        this.employeeId = employeeId;
        this.date = date;
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "employeeId=" + employeeId +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
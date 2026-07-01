package serviceImpl;

import service.AttendanceService;

import java.util.ArrayList;
import java.util.List;

public class AttendanceServiceImpl
        implements AttendanceService {

    List<Integer> attendance =
            new ArrayList<>();


    @Override
    public void markAttendance(
            int employeeId
    ) {

        attendance.add(
                employeeId
        );

        System.out.println(
                "Attendance Added"
        );

    }


    @Override
    public void showAttendance() {

        attendance.forEach(
                System.out::println
        );

    }

}
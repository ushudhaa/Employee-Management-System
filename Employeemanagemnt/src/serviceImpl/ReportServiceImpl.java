package serviceImpl;

import model.Employee;
import repository.EmployeeRepository;
import service.ReportService;

import java.util.Comparator;

public class ReportServiceImpl
        implements ReportService {

    EmployeeRepository repo =
            new EmployeeRepository();


    @Override
    public void generate() {

        Employee employee =
                repo
                        .findAll()
                        .stream()
                        .max(
                                Comparator
                                        .comparing(
                                                Employee
                                                        ::getSalary
                                        )
                        )
                        .orElse(
                                null
                        );

        System.out.println(
                employee
        );

    }

}
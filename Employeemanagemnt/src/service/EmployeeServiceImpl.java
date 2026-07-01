package service;

import exception.EmployeeNotFoundException;
import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeServiceImpl
        implements EmployeeService {

    List<Employee> employees =
            new ArrayList<>();

    @Override
    public void add(
            Employee employee
    ) {

        employees.add(employee);

    }

    @Override
    public void display() {

        employees.forEach(
                System.out::println
        );

    }

    @Override
    public Employee findById(
            int id
    ) {

        return employees
                .stream()
                .filter(
                        e ->
                                e.getId()
                                        ==
                                        id
                )
                .findFirst()
                .orElseThrow(
                        () ->
                                new EmployeeNotFoundException(
                                        "Not Found"
                                )
                );

    }

    @Override
    public void remove(
            int id
    ) {

        employees.removeIf(
                e ->
                        e.getId()
                                ==
                                id
        );

    }

    @Override
    public void updateSalary(
            int id,
            double salary
    ) {

        Employee emp =
                findById(id);

        emp.setSalary(
                salary
        );

    }

    public void highestSalary(){

        Employee emp =
                employees
                        .stream()
                        .max(
                                Comparator
                                        .comparing(
                                                Employee::getSalary
                                        )
                        )
                        .orElse(null);

        System.out.println(
                emp
        );

    }

}
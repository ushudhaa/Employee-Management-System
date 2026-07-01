import model.Staff;
import util.DataSeeder;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Staff> employees = DataSeeder.loadStaff();

        employees.stream()
                .filter(e -> e.getShift().equals("Day"))
                .forEach(e -> System.out.println(e.getName()));

        employees.stream()
                .filter(e -> e.getSalary() >= 50000)
                .forEach(System.out::println);

        long count = employees.stream()
                .filter(e -> e.getShift().equals("Night"))
                .count();

        System.out.println(count);

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
    }
}
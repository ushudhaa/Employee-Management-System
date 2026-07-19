package GUI;

import model.Employee;
import repository.EmployeeRepository;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class EmployeeGUI {
    public static final EmployeeRepository repository = new EmployeeRepository();

    public static void main(String[] args) {
        new WelcomeFrame();
    }
    public static Optional<Employee> findById(int id) {
        return repository.findAll().stream()
                .filter(e -> e.getID() == id)
                .findFirst();
    }
    public static void withEmployee(int id, Consumer<Employee> action, Runnable notFound) {
        Optional<Employee> emp = findById(id);
        if (emp.isPresent()) {
            action.accept(emp.get());
        } else {
            notFound.run();
        }
    }


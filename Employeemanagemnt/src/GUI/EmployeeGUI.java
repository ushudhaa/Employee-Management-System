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
    public static boolean idExists(int id) {
        return repository.findAll().stream().anyMatch(e -> e.getID() == id);
    }
}

class WelcomeFrame extends JFrame {
    public WelcomeFrame() {
        setTitle("Employee Management System");
        setSize(420, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(235, 245, 250));

        JLabel welcomeLabel = new JLabel("Employee Management System");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeLabel.setBounds(50, 40, 350, 30);
        add(welcomeLabel);

        JButton developerButton = new JButton("Developer");
        developerButton.setBounds(130, 100, 160, 40);
        add(developerButton);

        JButton managerButton = new JButton("Manager");
        managerButton.setBounds(130, 160, 160, 40);
        add(managerButton);

        developerButton.addActionListener(e -> {
            new DeveloperFrame();
            dispose();
        });

        managerButton.addActionListener(e -> {
            new ManagerFrame();
            dispose();
        });

        setVisible(true);
    }
}


package GUI;

import model.Employee;
import model.Manager;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerFrame extends JFrame {
    private JPanel mainPanel, leftPanel, rightPanel;
    private JTextField addIdField, addNameField, addAddressField, addAgeField,
            addSalaryField, addDeptField, addTeamSizeField;
    private JTextField findIdField;

    public ManagerFrame() {
        setTitle("Manager Management");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(235, 245, 250));

        mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.add(createAddPanel());

        rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(createFindPanel());
        rightPanel.add(createDisplayPanel());
        rightPanel.add(createBackButtonPanel());

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(500);
        splitPane.setResizeWeight(0.5);

        mainPanel.add(splitPane, BorderLayout.CENTER);
        add(mainPanel);
        setVisible(true);
    }

    private JPanel createBackButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton backButton = new JButton("Back to Main Menu");
        backButton.setPreferredSize(new Dimension(200, 40));
        backButton.addActionListener(e -> {
            new WelcomeFrame();
            dispose();
        });
        panel.add(backButton);
        return panel;
    }

    private JPanel createAddPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Add Manager"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        addIdField = new JTextField(20);
        addNameField = new JTextField(20);
        addAddressField = new JTextField(20);
        addAgeField = new JTextField(20);
        addSalaryField = new JTextField(20);
        addDeptField = new JTextField(20);
        addTeamSizeField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(150, 30));
        submitButton.addActionListener(e -> addManager());

        int y = 0;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("ID:"), gbc);
        gbc.gridx = 1; panel.add(addIdField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1; panel.add(addNameField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Address:"), gbc);
        gbc.gridx = 1; panel.add(addAddressField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1; panel.add(addAgeField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Salary:"), gbc);
        gbc.gridx = 1; panel.add(addSalaryField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Department:"), gbc);
        gbc.gridx = 1; panel.add(addDeptField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Team Size:"), gbc);
        gbc.gridx = 1; panel.add(addTeamSizeField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; gbc.gridwidth = 2; panel.add(submitButton, gbc);

        return panel;
    }

    private JPanel createFindPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBorder(BorderFactory.createTitledBorder("Find Manager by ID"));
        findIdField = new JTextField(20);
        findIdField.setPreferredSize(new Dimension(250, 30));
        JButton button = new JButton("Find");
        button.setPreferredSize(new Dimension(150, 30));
        button.addActionListener(e -> findManager());
        panel.add(new JLabel("Manager ID:"));
        panel.add(findIdField);
        panel.add(button);
        return panel;
    }

    private JPanel createDisplayPanel() {
        JButton displayButton = new JButton("Display All Managers");
        displayButton.addActionListener(e -> displayManagers());

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBorder(BorderFactory.createTitledBorder("Display Managers"));
        panel.add(displayButton);
        return panel;
    }

    private void addManager() {
        try {
            int id = Integer.parseInt(addIdField.getText().trim());

            if (EmployeeGUI.idExists(id)) {
                JOptionPane.showMessageDialog(this, "Employee ID already exists! Please enter a unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = addNameField.getText().trim();
            String address = addAddressField.getText().trim();
            int age = Integer.parseInt(addAgeField.getText().trim());
            Double salary = Double.parseDouble(addSalaryField.getText().trim());
            String dept = addDeptField.getText().trim();
            int teamSize = Integer.parseInt(addTeamSizeField.getText().trim());

            Manager newManager = new Manager(id, name, address, age, salary, dept, teamSize);
            EmployeeGUI.repository.save(newManager);

            JOptionPane.showMessageDialog(this, "Manager Added Successfully!");

            addIdField.setText("");
            addNameField.setText("");
            addAddressField.setText("");
            addAgeField.setText("");
            addSalaryField.setText("");
            addDeptField.setText("");
            addTeamSizeField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID/Age/Salary/Team Size. Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void findManager() {
        try {
            int id = Integer.parseInt(findIdField.getText().trim());
            EmployeeGUI.withEmployee(id,
                    emp -> {
                        if (emp instanceof Manager) {
                            JOptionPane.showMessageDialog(this, emp.toString());
                        } else {
                            JOptionPane.showMessageDialog(this, "That ID does not belong to a Manager.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    },
                    () -> JOptionPane.showMessageDialog(this, "Manager ID not found!", "Error", JOptionPane.ERROR_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayManagers() {
        JFrame displayFrame = new JFrame("Managers");
        displayFrame.setSize(850, 400);
        displayFrame.setLocationRelativeTo(this);

        String[] columnNames = {
                "ID", "Name", "Address", "Age", "Salary", "Department", "Team Size"
        };
        List<Manager> managers = EmployeeGUI.repository.findAll().stream()
                .filter(e -> e instanceof Manager)
                .map(e -> (Manager) e)
                .sorted((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()))
                .collect(Collectors.toList());

        String[][] data = new String[managers.size()][columnNames.length];

        for (int i = 0; i < managers.size(); i++) {
            Manager m = managers.get(i);
            data[i][0] = String.valueOf(m.getID());
            data[i][1] = m.getName();
            data[i][2] = m.getAddress();
            data[i][3] = String.valueOf(m.getAge());
            data[i][4] = String.valueOf(m.getSalary());
            data[i][5] = m.getDepartment();
            data[i][6] = String.valueOf(m.getTeamSize());
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        displayFrame.add(scrollPane);
        displayFrame.setVisible(true);
    }
}

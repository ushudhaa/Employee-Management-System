package GUI;

import model.Developer;
import model.Employee;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class DeveloperFrame extends JFrame {
    private JPanel mainPanel, leftPanel, rightPanel;
    private JTextField addIdField, addNameField, addAddressField, addAgeField,
            addLangField, addExpField, addProjectField;
    private JComboBox<String> addLevelField;
    private JTextField findIdField;

    public DeveloperFrame() {
        setTitle("Developer Management");
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
        panel.setBorder(BorderFactory.createTitledBorder("Add Developer"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        addIdField = new JTextField(20);
        addNameField = new JTextField(20);
        addAddressField = new JTextField(20);
        addAgeField = new JTextField(20);
        addLangField = new JTextField(20);
        addExpField = new JTextField(20);
        addProjectField = new JTextField(20);

        String[] levels = {"Junior", "Mid", "Senior"};
        addLevelField = new JComboBox<>(levels);
        addLevelField.setPreferredSize(new Dimension(200, 25));

        JButton submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(150, 30));
        submitButton.addActionListener(e -> addDeveloper());

        int y = 0;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("ID:"), gbc);
        gbc.gridx = 1; panel.add(addIdField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1; panel.add(addNameField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Address:"), gbc);
        gbc.gridx = 1; panel.add(addAddressField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1; panel.add(addAgeField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Programming Language:"), gbc);
        gbc.gridx = 1; panel.add(addLangField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Experience (years):"), gbc);
        gbc.gridx = 1; panel.add(addExpField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Project Name:"), gbc);
        gbc.gridx = 1; panel.add(addProjectField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; panel.add(new JLabel("Level:"), gbc);
        gbc.gridx = 1; panel.add(addLevelField, gbc); y++;
        gbc.gridx = 0; gbc.gridy = y; gbc.gridwidth = 2; panel.add(submitButton, gbc);

        return panel;
    }

    private JPanel createFindPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBorder(BorderFactory.createTitledBorder("Find Developer by ID"));
        findIdField = new JTextField(20);
        findIdField.setPreferredSize(new Dimension(250, 30));
        JButton button = new JButton("Find");
        button.setPreferredSize(new Dimension(150, 30));
        button.addActionListener(e -> findDeveloper());
        panel.add(new JLabel("Developer ID:"));
        panel.add(findIdField);
        panel.add(button);
        return panel;
    }

    private JPanel createDisplayPanel() {
        JButton displayButton = new JButton("Display All Developers");
        displayButton.addActionListener(e -> displayDevelopers());

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBorder(BorderFactory.createTitledBorder("Display Developers"));
        panel.add(displayButton);
        return panel;
    }

    private void addDeveloper() {
        try {
            int id = Integer.parseInt(addIdField.getText().trim());
            // Java 8: anyMatch replaces a manual for-loop duplicate check
            if (EmployeeGUI.idExists(id)) {
                JOptionPane.showMessageDialog(this, "Employee ID already exists! Please enter a unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = addNameField.getText().trim();
            String address = addAddressField.getText().trim();
            int age = Integer.parseInt(addAgeField.getText().trim());
            String lang = addLangField.getText().trim();
            int exp = Integer.parseInt(addExpField.getText().trim());
            String project = addProjectField.getText().trim();
            String level = (String) addLevelField.getSelectedItem();

            Developer newDev = new Developer(id, name, address, age, lang, exp, project, level);
            EmployeeGUI.repository.save(newDev);

            JOptionPane.showMessageDialog(this, "Developer Added Successfully!");

            addIdField.setText("");
            addNameField.setText("");
            addAddressField.setText("");
            addAgeField.setText("");
            addLangField.setText("");
            addExpField.setText("");
            addProjectField.setText("");
            addLevelField.setSelectedIndex(0);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID/Age/Experience. Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void findDeveloper() {
        try {
            int id = Integer.parseInt(findIdField.getText().trim());
            EmployeeGUI.withEmployee(id,
                    emp -> {
                        if (emp instanceof Developer) {
                            JOptionPane.showMessageDialog(this, emp.toString());
                        } else {
                            JOptionPane.showMessageDialog(this, "That ID does not belong to a Developer.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    },
                    () -> JOptionPane.showMessageDialog(this, "Developer ID not found!", "Error", JOptionPane.ERROR_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayDevelopers() {
        JFrame displayFrame = new JFrame("Developers");
        displayFrame.setSize(950, 400);
        displayFrame.setLocationRelativeTo(this);

        String[] columnNames = {
                "ID", "Name", "Address", "Age", "Level", "Salary", "Language", "Experience", "Project"
        };

        // Java 8: Stream API - filter by type, sort by name using a method reference, collect
        List<Developer> developers = EmployeeGUI.repository.findAll().stream()
                .filter(e -> e instanceof Developer)
                .map(e -> (Developer) e)
                .sorted((d1, d2) -> d1.getName().compareToIgnoreCase(d2.getName()))
                .collect(Collectors.toList());

        String[][] data = new String[developers.size()][columnNames.length];

        for (int i = 0; i < developers.size(); i++) {
            Developer d = developers.get(i);
            data[i][0] = String.valueOf(d.getID());
            data[i][1] = d.getName();
            data[i][2] = d.getAddress();
            data[i][3] = String.valueOf(d.getAge());
            data[i][4] = d.getLevel();
            data[i][5] = String.valueOf(d.getSalary());
            data[i][6] = d.getProgrammingLanguage();
            data[i][7] = String.valueOf(d.getExperienceYears());
            data[i][8] = d.getProjectName();
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        displayFrame.add(scrollPane);
        displayFrame.setVisible(true);
    }
}

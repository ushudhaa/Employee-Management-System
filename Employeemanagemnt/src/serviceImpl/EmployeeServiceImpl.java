import model.Staff;
import service.EmployeeService;
import java.util.List;
import java.util.Scanner;

import static javax.swing.text.html.parser.DTDConstants.ID;

public class EmployeeServiceImpl implements EmployeeService {

    private List<Staff> employees;
    private Scanner sc = new Scanner(System.in);

    public EmployeeServiceImpl(List<Staff> employees) {
        this.employees = employees;
    }

    public int getID() {
        return ID;
    }}
package util;

public class EmployeeUtil {

    // Prints a separator line in the console
    public static void line() {
        System.out.println("------------------------------");
    }
    // Prints a title with separator lines
    public static void title(String title) {

        line();
        System.out.println(title);
        line();
    }
}
package util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner sc =
            new Scanner(System.in);

    public static int inputInt(
            String message
    ) {

        System.out.print(message);

        return sc.nextInt();

    }


    public static double inputDouble(
            String message
    ) {

        System.out.print(message);

        return sc.nextDouble();

    }


    public static String inputString(
            String message
    ) {

        System.out.print(message);

        sc.nextLine();

        return sc.nextLine();

    }

}
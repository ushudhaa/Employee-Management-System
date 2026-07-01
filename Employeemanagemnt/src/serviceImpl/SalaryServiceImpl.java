package serviceImpl;

import exception.InvalidSalaryException;
import service.SalaryService;

public class SalaryServiceImpl
        implements SalaryService {

    @Override
    public void calculateSalary(
            double salary,
            int bonus
    ) throws Throwable {

        if(
                salary<
                        0
        ){

            throw new Throwable(
                    "Invalid Salary"
            );

        }

        double total =
                salary+
                        bonus;

        System.out.println(
                "Final Salary : "
                        +
                        total
        );

    }

}
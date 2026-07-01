import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Staff> main(String[] args) {

        List<Staff> employees = new ArrayList<>();

        employees.add(new Staff(101, "Ram", "Kathmandu", 25, "Day", "IT", 8, 50000.0));
        employees.add(new Staff(102, "Shyam", "Pokhara", 30, "Night", "HR", 8, 45000.0));
        employees.add(new Staff(103, "Hari", "Lalitpur", 28, "Day", "Finance", 7, 55000.0));
        employees.add(new Staff(104, "Sita", "Bhaktapur", 26, "Night", "Administration", 8, 42000.0));
        employees.add(new Staff(105, "Gita", "Biratnagar", 29, "Day", "Accounts", 8, 48000.0));
        employees.add(new Staff(106, "Ramesh", "Butwal", 32, "Night", "Security", 10, 40000.0));
        employees.add(new Staff(107, "Anita", "Dharan", 27, "Day", "Reception", 8, 38000.0));
        employees.add(new Staff(108, "Kiran", "Janakpur", 31, "Night", "Maintenance", 9, 41000.0));
        employees.add(new Staff(109, "Pooja", "Hetauda", 24, "Day", "Library", 8, 35000.0));
        employees.add(new Staff(110, "Bikash", "Nepalgunj", 33, "Night", "Transport", 10, 46000.0));
        employees.add(new Staff(111, "Sunita", "Chitwan", 28, "Day", "Store", 8, 39000.0));
        employees.add(new Staff(112, "Nabin", "Dhangadhi", 35, "Night", "Administration", 9, 52000.0));
        employees.add(new Staff(113, "Asha", "Itahari", 26, "Day", "Accounts", 8, 43000.0));
        employees.add(new Staff(114, "Suman", "Birtamod", 30, "Night", "HR", 8, 47000.0));
        employees.add(new Staff(115, "Rita", "Tulsipur", 27, "Day", "IT", 8, 51000.0));

return employees;


        //staff who works on IT department
       /* List<Staff> staffList =
                employees.stream()
                        .filter(e -> e.getDepartment().equals("IT"))
                        .toList();*/
        /*        staffList.forEach(s ->
                System.out.println(
                        s.getName() + " , " +
                                s.getAddress() + " , " +
                                s.getDepartment()
                )
        );*/
        //stream questions


        //1. print day shift staff
        /*List<Staff> staffList1 = employees.stream().filter(e-> e.getShift().equals("Day")).toList();
        staffList1.forEach(s->
                System.out.println(s.getName()));*/

        //2. print staff whose salary is greater than 50000
        /*List<Staff> salaryOfStaff = employees.stream().filter(e->e.getSalary()>=50000).toList();
        salaryOfStaff.forEach(
                s-> System.out.println(s.getName())
        );*/

        //3. count how many staff are in night shift\
/*
        long count = employees.stream().filter(e -> e.getShift() == "Night").count();
        System.out.println(count);*/

        //4. Department = HR vako sab ko name print gara
       /* List<Staff> hr = employees.stream().filter(e -> e.getDepartment()=="HR").toList();
        hr.forEach(s-> System.out.println(s.getName()));*/

        //5. Staff ko name matra new list ma convert gara
   /*     List<String> list = employees.stream().map(e -> e.getName().toUpperCase()).toList();
        list.forEach(s-> System.out.println(s));*/

        //6. sorted
        /*List<Staff> list = employees.stream().filter(e -> e.getSalary() > 500)
                .sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary())).toList();
            list.forEach(s-> System.out.println(s.getSalary()));*/


    }
    }
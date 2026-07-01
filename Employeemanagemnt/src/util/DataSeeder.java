package util;

import model.Staff;
import java.util.ArrayList;
import java.util.List;

public class DataSeeder {

    public static List<Staff> loadStaff() {

        List<Staff> employees = new ArrayList<>();

        employees.add(new Staff(101,"Ram","Kathmandu",25,"Day","IT",8,50000));
        employees.add(new Staff(102,"Shyam","Pokhara",30,"Night","HR",8,45000));
        employees.add(new Staff(103,"Hari","Lalitpur",28,"Day","Finance",7,55000));
        employees.add(new Staff(104,"Sita","Bhaktapur",26,"Night","Administration",8,42000));
        employees.add(new Staff(105,"Gita","Biratnagar",29,"Day","Accounts",8,48000));
        employees.add(new Staff(106,"Ramesh","Butwal",32,"Night","Security",10,40000));
        employees.add(new Staff(107,"Anita","Dharan",27,"Day","Reception",8,38000));
        employees.add(new Staff(108,"Kiran","Janakpur",31,"Night","Maintenance",9,41000));
        employees.add(new Staff(109,"Pooja","Hetauda",24,"Day","Library",8,35000));
        employees.add(new Staff(110,"Bikash","Nepalgunj",33,"Night","Transport",10,46000));
        employees.add(new Staff(111,"Sunita","Chitwan",28,"Day","Store",8,39000));
        employees.add(new Staff(112,"Nabin","Dhangadhi",35,"Night","Administration",9,52000));
        employees.add(new Staff(113,"Asha","Itahari",26,"Day","Accounts",8,43000));
        employees.add(new Staff(114,"Suman","Birtamod",30,"Night","HR",8,47000));
        employees.add(new Staff(115,"Rita","Tulsipur",27,"Day","IT",8,51000));

        return employees;
    }
}
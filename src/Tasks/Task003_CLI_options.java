package Tasks;

import java.sql.SQLOutput;

public class Task003_CLI_options {
    public static void main(String[] args) {

        System.out.println("Enter the Name, age and salary");
        String Name = args[0];
        int Age = Integer.parseInt(args[1]);
        double Salary = Double.parseDouble(args[2]);

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Salary);



    }
}

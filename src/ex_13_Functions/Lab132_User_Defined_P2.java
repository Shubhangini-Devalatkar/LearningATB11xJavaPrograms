package ex_13_Functions;

import javax.naming.Name;

public class Lab132_User_Defined_P2 {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        wp_wr_greet();


        // 2.Without Parameters but With Return Type
        String Msg = WithoutParameter_ReturnType();
        System.out.println(Msg);

        // 3.With Parameters and Without Return Type
        WithParameter_NoReturnType("Arjun", 20, 20000);

        greet_with_full_name("Java", "Program");

        //  4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(190,900);
        int sum3 = sum_of_two_numbers(2345,5432);
        int sum4 = sum_of_three_numbers(2345,5432, 5432);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        int result = Math.max(3,4); // 4th Type


    }

    static void wp_wr_greet() {
        System.out.println("Java Programs");
    }

    static String WithoutParameter_ReturnType() {
        System.out.println("Message");
        return "HelloWorld Java";

    }

    static void WithParameter_NoReturnType(String Name, int age, double salary) {
        System.out.println("Your name is ->" + Name + "\nYour age is " + age + "\nYour salary is " + salary);

    }

    static void greet_with_full_name(String firstname, String lastname) {
        System.out.println("Hi, Your name is " + firstname + lastname);
    }

    static int sum_of_two_numbers(int a, int b) {
        return a + b;

    }

    static int sum_of_three_numbers(int a, int b, int c) {
        return a + b + c;
    }
}


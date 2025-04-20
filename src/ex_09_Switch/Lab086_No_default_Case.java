package ex_09_Switch;

import java.util.Scanner;

public class Lab086_No_default_Case {
    public static void main(String[] args) {
        // Switch

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number between 1 to 7");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}

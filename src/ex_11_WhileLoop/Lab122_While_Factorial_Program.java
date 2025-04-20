package ex_11_WhileLoop;

import java.util.Scanner;

public class Lab122_While_Factorial_Program {
    public static void main(String[] args) {
        // Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Factorial Program\nEnter the no whose factorial you want!");
        int number = scanner. nextInt();

        int factorial = 1;
        if (number <= 0){
            System.out.println(factorial);
        }else {
            for (int i = 1; i<= number; i++){
                factorial = factorial*i;

            }
        }
        System.out.println("Fcatorial is ->" + factorial);

    }
}

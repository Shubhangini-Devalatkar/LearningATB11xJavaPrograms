package ex_30_Exceptions;

import java.util.Scanner;

public class Lab236_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You cant Vote!!");
        }
    }
}

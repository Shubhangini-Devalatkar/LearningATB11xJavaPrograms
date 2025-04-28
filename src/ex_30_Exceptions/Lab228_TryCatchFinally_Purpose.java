package ex_30_Exceptions;

import java.util.Scanner;

public class Lab228_TryCatchFinally_Purpose {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int V = sc.nextInt();
        try {
            int b = 10/V;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Close the Scanner class");
        }
    }
}

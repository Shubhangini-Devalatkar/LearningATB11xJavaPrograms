package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Arrays_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size = scanner.nextInt();


        int[] Numbers = new int[size];
        for (int i =0; i< Numbers.length; i++){
            System.out.println("Enter the numbers");
            Numbers[i] = scanner.nextInt();
        }
        System.out.println("-----");

        for (int i=0; i< Numbers.length; i++){
            System.out.println(Numbers[i]);
        }
        scanner.close();
    }
}

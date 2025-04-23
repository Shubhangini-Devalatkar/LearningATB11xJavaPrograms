package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2D_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size_of_the_table = scanner.nextInt();

        for (int i=1; i<size_of_the_table; i++){
            for (int j=1; j<size_of_the_table; j++){
                System.out.print(i + "x"+ j+ "=" +(i*j) + "\t\t");
            }
            System.out.println();
        }
    }
}

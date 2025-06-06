package Tasks;

import java.util.Scanner;

public class Task006_Triangle_Classifier {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.


//        int t1 = Integer.parseInt(args[0]);
//        int t2 = Integer.parseInt(args[1]);
//        int t3 = Integer.parseInt(args[2]);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side1");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Side2");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Side3");
        int side3 = scanner.nextInt();

        if (side1 <=0 || side2 <=0 || side3 <=0){
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        if(side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){
            System.out.println("This is also not a triangle");
            System.exit(0);
        }

        if (side1 == side2 && side2 == side3){
            System.out.println("This is Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("This is Isosceles Triangle");
        } else {
            System.out.println("This is Scalene Triangle");
        }
        scanner.close();

    }
}

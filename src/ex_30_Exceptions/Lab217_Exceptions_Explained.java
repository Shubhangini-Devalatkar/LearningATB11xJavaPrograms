package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {

        System.out.println("Start the Program");
        String Input_User = args[0];// java.lang.ArrayIndexOutOfBoundsException
        int A1 = Integer.parseInt(Input_User); // NumberFormatException
        int output = 100/A1; // java.lang.ArithmeticException
        System.out.println(output);
        System.out.println("End the Program");


    }
}

package ex_30_Exceptions;

public class Lab231_Example_3 {
    public static void main(String[] args) {

        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a;// ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException |ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

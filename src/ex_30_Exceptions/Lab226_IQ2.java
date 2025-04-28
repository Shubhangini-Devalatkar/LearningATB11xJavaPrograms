package ex_30_Exceptions;

public class Lab226_IQ2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;// Vulnerable code should be there in the try and catch block
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

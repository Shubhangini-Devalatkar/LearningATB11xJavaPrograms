package ex_30_Exceptions;

public class Lab225_IQ {
    public static void main(String[] args) {

        try {
            String Input_User = args[0];
            int a = Integer.parseInt(Input_User);
            int output = 100/a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

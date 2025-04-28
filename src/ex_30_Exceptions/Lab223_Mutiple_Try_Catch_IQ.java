package ex_30_Exceptions;

public class Lab223_Mutiple_Try_Catch_IQ {
    public static void main(String[] args) {

        System.out.println("Start");

        try {
            int a = 10/0;
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Not possible as Big Exception is used before
        //catch (ArithmeticException e) {
          //  System.out.println(e.getMessage());
        //}

        System.out.println("Stop");
    }
}

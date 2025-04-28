package ex_30_Exceptions;

public class Lab232_IQ_1 {
    public static void main(String[] args) {
         final double PI = 3.14f;
         int a = 0;
         try {
             int X = 10 / a;
         }catch (Exception e){
             System.out.println(" Div by Zero");
         }finally {
             System.out.println("Program will be executed anyhow");
         }
    }
}

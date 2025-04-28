package ex_30_Exceptions;

import ex_13_Functions.Lab134_Function_Arth;

public class Lab222_Multiple_Try_Catch {
    public static void main(String[] args) {

        System.out.println("Start");

        try {
            int a = 10/0;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Stop");
    }
}

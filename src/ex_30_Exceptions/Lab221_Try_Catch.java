package ex_30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {


        System.out.println("Math Division");
        try {
            int a = 10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}

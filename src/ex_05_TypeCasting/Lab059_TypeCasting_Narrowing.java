package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a = 100;
       // byte b = a; // Invalid narrowing - Implicit casting is not allowed.
        byte b1 = (byte)a; // Valid Explicit - Explicit allowed.
        //Data loss
        System.out.println(b1);

    }
}

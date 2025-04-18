package ex_05_TypeCasting;

public class Lab061_TypeCasting_Use {
    public static void main(String[] args) {
        int course = 1000;
        float GST = 18.45f;
       // int total = course + GST; // Narrow Implicit
        int total1 = course + (int)GST;
        System.out.println(total1);

        float total2 = course + GST;
        System.out.println(total2);

        float total3 = (float)course + GST;
        System.out.println(total3);


    }
}

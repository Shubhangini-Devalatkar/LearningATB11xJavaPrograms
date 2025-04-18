package Tasks;

public class Task002_Increment_Decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int a1 = 20;
        System.out.println(--a1 + a1++ + a1--);
        System.out.println(a1);
    }
}


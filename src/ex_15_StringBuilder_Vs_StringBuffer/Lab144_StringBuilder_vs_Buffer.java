package ex_15_StringBuilder_Vs_StringBuffer;

public class Lab144_StringBuilder_vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Microsoft";
        String s1 = new String ("Microsoft");

        StringBuffer stringbuffer = new StringBuffer("Microsoft");
        StringBuilder stringbuilder = new StringBuilder("Microsoft");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);


    }
}

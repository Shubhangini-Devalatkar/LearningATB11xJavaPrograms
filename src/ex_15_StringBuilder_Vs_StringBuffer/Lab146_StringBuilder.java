package ex_15_StringBuilder_Vs_StringBuffer;

public class Lab146_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("Google");
        stringbuilder.append("Javascript");
        System.out.println(stringbuilder);
        System.out.println(stringbuilder.reverse());


    }
}

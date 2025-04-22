package ex_15_StringBuilder_Vs_StringBuffer;

public class Lab147_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("Java");
        stringbuilder.append("Script");
        stringbuilder.reverse();
        System.out.println(stringbuilder);

    }
}

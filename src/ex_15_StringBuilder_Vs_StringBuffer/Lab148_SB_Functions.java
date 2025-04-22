package ex_15_StringBuilder_Vs_StringBuffer;

public class Lab148_SB_Functions {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Java");
        stringbuffer.append(" Programming");
        System.out.println(stringbuffer);
        stringbuffer.delete(5,16);
        System.out.println(stringbuffer);
        stringbuffer.replace(0, 4, "C++");
        System.out.println(stringbuffer);


    }
}

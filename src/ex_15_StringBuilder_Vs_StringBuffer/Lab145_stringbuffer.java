package ex_15_StringBuilder_Vs_StringBuffer;

public class Lab145_stringbuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Microservices");
        stringBuffer.append("Javascript");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

// Difference between StringBuffer and strings
        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
